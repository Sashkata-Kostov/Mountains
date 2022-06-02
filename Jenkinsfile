pipeline {

    agent any
    tools {
        maven 'Maven'
    }

    stages {
        stage("build") {
            steps {
                sh 'mvn clean install -Dmaven.test.skip=true'
            }
        }

        stage("test") {
            steps {
                sh 'mvn test'
            }
        }

        stage("Scan With Sonar") {
            steps {
                withSonarQubeEnv(installationName: 'sq1') {
                    sh 'mvn clean package sonar:sonar'
                }
            }
        }

        stage("Sonar Quality Gate") {
            steps {
                timeout(time: 3, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }

        stage("Build Docker Image") {
            steps {
                sh "docker build -t aleks/mountains ."
            }
        }

        stage("Start New Docker Container") {
            steps {
                sh "docker run --rm -p 8090:8090 -d aleks/mountains"
            }
        }
    }
}