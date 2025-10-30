node('agent2') {
    stage('Build') {
        echo 'Building PROD...'
    }
    stage('Deploy') {
        echo 'Deploying to PROD...'
    }
}
