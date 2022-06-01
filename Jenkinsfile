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
    }
}