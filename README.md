## Installation guide
1. Install Gauge on your operating system: 
https://docs.gauge.org/getting_started/installing-gauge.html?os=macos&language=java&ide=intellij
2. Install IntelliJ IDEA (Community Edition is sufficient)
3. Start IntelliJ IDEA
   1. Navigate to IntelliJ->Settings->Plugins-> search for "Gauge" -> install it
   2. Navigate to IntelliJ->Settings->Tools->Gauge-> Set Gauge binary path
      - Windows: %ProgramFiles%\gauge\bin
      - MacOS: /usr/local/bin
      (If installed with brew: /opt/homebrew/bin/gauge)
   3. Close settings dialogue (Click on OK)
4. Navigate to File->Project Structure->Project Settings/Project->Set SDK: Choose/download "Eclipse Temurin (AdoptOpenJDK Hotspot) 11.0.24 - arch64"


## Exercise with Star Wars API (SWAPI)
Using a gauge test, we want to invoke the API and check it for functionality. 

Tools: IDE (IntelliJ), Java(>=11), Gauge, Maven
1. Please create a gauge specification file and describe the test case for the API test in it (in a syntax similar to Markdown).
   Information on how to write specifications in Gauge can be found here https://docs.gauge.org/writing-specifications?os=macos&language=java&ide=vscode#specifications-spec.
   - Test requirement is to invoke the API and check that the HTTP status code is 200.
   - API: `https://swapi.dev/api/planets`, HTTP method: `GET`, Accept: `application/json`

   
2. Writing test code in Java. Please implement the defined steps from the specification in a new java class. 
A sample implementation can be found in `src/test/java/StepImplementation.java`.


3. Execute your Gauge test!


4. Evalution of results.

Let's explore the world of Star Wars!