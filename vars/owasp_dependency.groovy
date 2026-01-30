def call() {
    sh '''
      echo "Running OWASP Dependency Check (no update mode)..."
      mkdir -p owasp-report
      dependency-check.sh \
        --noupdate \
        --scan . \
        --format ALL \
        --project wanderlust \
        --out owasp-report
    '''
}

