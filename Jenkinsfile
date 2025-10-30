pipeline {
    agent any
    parameters {
        choice(name: 'ENV', choices: ['dev', 'prod'], description: 'Choose environment')
    }
    stages {
        stage('Select File') {
            steps {
                script {
                    if (params.ENV == 'prod') {
                        load 'Jenkinsfile-prod'
                    } else {
                        load 'Jenkinsfile-dev'
                    }
                }
            }
        }
    }
}
