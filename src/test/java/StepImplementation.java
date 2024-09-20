import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;

import static org.junit.Assert.assertEquals;

public class StepImplementation {

    private int actualSum;

    @Step("Step 1: <param1> <param2>")
    public void step1(String param1, String param2) {
        Gauge.writeMessage(param1 + " " + param2);
    }

    @Step("Step 2: calculate <summand1> + <summand>")
    public void step2(int summand1, int summand2) {
        actualSum = summand1 + summand2;
    }

    @Step("Step 3: expected sum is <sum>")
    public void step3(int expectedSum) {
        assertEquals(expectedSum, actualSum);
    }
}
