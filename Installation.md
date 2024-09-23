## Installation guide
1. Install Gauge on your operating system:
   https://docs.gauge.org/getting_started/installing-gauge.html?os=macos&language=java&ide=intellij
2. Install Maven on your operating system
    - Maven should be added to the system environment variables
3. Install IntelliJ IDEA (Community Edition is sufficient) on your operating system
4. Start IntelliJ IDEA
   1. Navigate to IntelliJ->Settings->Plugins-> search for "Gauge" -> install it
   2. Navigate to IntelliJ->Settings->Tools->Gauge-> Set Gauge binary path
      - Windows: %ProgramFiles%\gauge\bin
      - MacOS: /usr/local/bin
        (If installed with brew: /opt/homebrew/bin/gauge)
   3. Navigate to IntelliJ->Settings->Build,Execution,Deployment->Build Tools->Maven
      - Maven home path should be set
   4. Close settings dialogue (Click on OK)
5. Navigate to File->Project Structure->Project Settings/Project->Set SDK: Choose/download "Eclipse Temurin (AdoptOpenJDK Hotspot) 11.0.24 - arch64"
