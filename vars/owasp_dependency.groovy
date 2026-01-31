def call() {
    sh """
    echo "OWASP Dependency Check temporarily disabled (NVD down)."
    echo "Creating empty report so pipeline can continue."

    mkdir -p owasp-report
    echo "<dependency-check></dependency-check>" > owasp-report/dependency-check-report.xml
    echo "<html><body><h2>OWASP scan skipped (NVD unavailable)</h2></body></html>" > owasp-report/dependency-check-report.html
    """
}

