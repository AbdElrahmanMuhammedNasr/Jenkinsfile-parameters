pipeline {
    agent {label 'agent2'}
    stages {
        stage('Build') { steps { echo 'Building PROD...' } }
        stage('Deploy') { steps { echo 'Deploying to PROD...' } }
    }
}
