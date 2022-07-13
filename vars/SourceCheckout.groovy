def call(def giturl, def branch) {

    println ""
    println "******** Git URL:  ${giturl} *********"
    println ""
    println "******** Git Branch:  ${branch} *********"
    println ""

    if (giturl.contains("github.com"))
    {
        checkout([$class: 'GitSCM', branches: [[name: branch ]], extensions: [], userRemoteConfigs: [
            [credentialsId: 'github', url: giturl]
        ]])
    }
    else
    {
        error("Please provide valid github url")
    }

}
