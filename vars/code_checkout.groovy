def call(String repo, String branch) {
    stage('Git: Code Checkout') {
        git url: repo, branch: branch
    }
}
