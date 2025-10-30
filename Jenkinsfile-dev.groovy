node('agent2') {
    stage('Build') {
        echo 'Building DEV...'
    }
    stage('Deploy') {
        echo 'Deploying to DEV...'
    }
}
