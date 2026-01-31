def call(toolName, projectKey, projectName) {
    withSonarQubeEnv('SonarQube-Server') {
        sh """
        ${tool toolName}/bin/sonar-scanner \
        -Dsonar.projectKey=${projectKey} \
        -Dsonar.projectName=${projectName} \
        -Dsonar.sources=.
        """
    }
}

