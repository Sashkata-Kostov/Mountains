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

        stage("analyse") {
            steps {
                echo "Analysing with SonarQube."
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