pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/ducnguyen020914/jenkin-java.git'
            }
        }
        stage('EchoLog') {
            steps {
                sh 'echo "Building"'
            }
        }
    }
}
