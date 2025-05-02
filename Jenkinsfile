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

        stage('Publish Reports') {
            steps {
                echo 'Publishing TestNG test results...'
                junit 'test-output/testng-results.xml'  // TestNG creates this XML file
            }
        }
    }

    post {
        success {
            echo '✅ Build and tests succeeded!'
        }
        failure {
            echo '❌ Build or tests failed.'
        }
        always {
            echo '🎯 Pipeline finished.'
        }
    }
}
