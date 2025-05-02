pipeline {
    agent any



    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/puja9897/jenkins-automation.git'  // Replace with your actual repo URL
            }
        }

        stage('Build and Compile') {
            steps {
                echo 'Running Maven clean and compile...'
                bat 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                echo 'Executing Selenium + TestNG tests...'
                bat 'mvn test'
            }
        }

    }
}
