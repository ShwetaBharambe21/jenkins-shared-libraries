def call(String toolName, String projectKey, String projectName) {
    withSonarQubeEnv('Sonar') {
        def scannerHome = tool 'Sonar'
        sh """
        ${scannerHome}/bin/sonar-scanner \
          -Dsonar.projectKey=${projectKey} \
          -Dsonar.projectName=${projectName} \
          -Dsonar.sources=.
        """
    }
}

