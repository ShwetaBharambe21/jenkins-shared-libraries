def call() {
    sh '''
      echo "Running OWASP Dependency Check..."
      mkdir -p owasp-report
      dependency-check.sh \
        --scan . \
        --format ALL \
        --project wanderlust \
        --out owasp-report
    '''
}

