def call() {
    echo "Waiting for SonarQube Quality Gate..."
    timeout(time: 5, unit: 'MINUTES') {
        def qg = waitForQualityGate()
        if (qg.status != 'OK') {
            error "Quality Gate failed: ${qg.status}"
        }
    }
}

