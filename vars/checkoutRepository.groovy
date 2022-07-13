def checkoutRepository(gitCredentialsId1, url1) {
  stage('Git Checkout') {
            steps {
                git credentialsId: gitCredentialsId1, url: url1
            }
        }
  
}
