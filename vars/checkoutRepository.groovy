
def checkoutRepository(gitCredentialsId1, url1) {
  stage('Git Checkout') {
            steps {
              git credentialsId: ${gitCredentialsId1}, url: ${url1}
            }
        }
}

def callAnotherJob(jobName) {
   stage("Ovde ce biti definisani parametri i bice pozvan job2 bez parametara") {
            steps {
                script {
                  build job: ${jobName}, parameters: [[$class: 'StringParameterValue', name: 'Name', value: "Ana"]]
                }
            }
        }
}

/*
def checkoutRepository(gitCredentialsId1, url1) {
   stage('Git Checkout') {
      steps {
        script {
          withCredentials([
            usernamePassword(credentialsId: 'github',
              usernameVariable: 'jovanovic.ana9898@gmail.com',
              passwordVariable: 'Pernica123Pernica')
          ]) {
            print 'username=' + username + 'password=' + password

            print 'username.collect { it }=' + username.collect { it }
            print 'password.collect { it }=' + password.collect { it }
            git credentialsId: gitCredentialsId1, url: url1
          }
        }
      }
    }
}
*/

