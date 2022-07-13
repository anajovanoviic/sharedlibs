
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


def checkoutRepository1() {

    withCredentials([
        usernamePassword(credentialsId:'github',
        usernameVariable: 'username',
        passwordVariable: 'password'
        )
    ]) {

        sh "git clone https://$username:$password@github.com/anajovanoviic/sharedlibs.git"
    }
}

