pipeline {
    agent { label 'agent2' }
    parameters {
        choice(name: 'ENV', choices: ['dev', 'prod'], description: 'Choose environment')
    }
    stages {
        stage('Select File') {
            steps {
                script {
                    def scriptFile = params.ENV == 'prod' ? 'Jenkinsfile-prod.groovy' : 'Jenkinsfile-dev.groovy'
                    echo "Loading ${scriptFile}"
                    load scriptFile
                }
            }
        }
    }
}
