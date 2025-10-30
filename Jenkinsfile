pipeline {
    agent {label 'agent2'}
    parameters {
        choice(name: 'ENV', choices: ['dev', 'prod'], description: 'Choose environment')
    }
    stages {
        stage('Select File') {
            steps {
                script {
                    if (params.ENV == 'prod') {
                        load 'Jenkinsfile-prod.groovy'
                    } else {
                        load 'Jenkinsfile-dev.groovy'
                    }
                }
            }
        }
    }
}
