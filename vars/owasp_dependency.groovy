def call() {
    sh '''
      echo "Running OWASP Dependency Check..."
      dependency-check.sh \
        --scan . \
        --format ALL \
        --project wanderlust \
        --out owasp-report
    '''
}

