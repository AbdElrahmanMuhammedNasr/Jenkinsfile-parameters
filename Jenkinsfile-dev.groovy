 
    stages {
        stage('Build') { steps { echo 'Building DEV...' } }
        stage('Deploy') { steps { echo 'Deploying to DEV...' } }
    }
