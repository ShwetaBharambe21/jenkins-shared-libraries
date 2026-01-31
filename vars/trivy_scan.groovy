def trivy_scan() {
    sh """
      echo "Running Trivy filesystem scan..."
      trivy fs --severity CRITICAL,HIGH --exit-code 0 .
    """
}

