def call() {

 withCredentials([sshUserPrivateKey(credentialsId: 'private-key', keyFileVariable: 'ubuntu')]) {
                 sh "export ANSIBLE_HOST_KEY_CHECKING=False && ansible-playbook -i inventory/dev ping.yml -e 'ansible_ssh_private_key_file=$ubuntu ansible_user=anaworker ansible_sudo_pass=francuski1' " 
}

}


