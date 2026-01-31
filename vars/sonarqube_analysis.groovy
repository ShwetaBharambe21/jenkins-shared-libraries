def call(String projectKey, String projectName) {
    sh """
    echo "Running SonarQube scan..."
    sonar-scanner \
      -Dsonar.projectKey=${projectKey} \
      -Dsonar.projectName=${projectName} \
      -Dsonar.sources=. \
      -Dsonar.host.url=http://<YOUR-SONAR-IP>:9000 \
      -Dsonar.login=${SONAR_TOKEN}
    """
}

