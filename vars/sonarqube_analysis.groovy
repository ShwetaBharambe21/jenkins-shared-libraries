def call(String scannerName, String projectKey, String projectName) {
    withSonarQubeEnv(scannerName) {
        sh """
        sonar-scanner \
          -Dsonar.projectKey=${projectKey} \
          -Dsonar.projectName=${projectName} \
          -Dsonar.sources=.
        """
    }
}

