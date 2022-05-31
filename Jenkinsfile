pipeline {

    agent any
    tools {
        maven 'Maven'
    }

    stages {
        stage("build") {
            steps {
                sh 'mvn clean install'
            }
        }

        stage("test") {
            steps {
                echo "Building..."
            }
        }

        stage("analyse") {
            steps {
                echo "Building..."
            }
        }

        stage("deploy") {
            steps {
                echo "Building..."
            }
        }
    }
}