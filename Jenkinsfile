pipeline {

      environment {
        imagename = "aleks/mountains"
        registryCredential = 'docker-hub-credentials'
        dockerImage = ''
      }

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
                sh 'mvn test'
            }
        }

        stage("analyse") {
            steps {
                echo "Analysing with SonarQube."
            }
        }

        stage("Build Image") {
            steps {
                script {
                    dockerImage = docker.build imagename
                }
            }
        }

        stage("Deploy Image") {
            steps {
                script {
                    docker.withRegistry( '', registryCredential ) {
                        dockerImage.push("$BUILD_NUMBER")
                        dockerImage.push('latest')
                    }
                }
            }
        }

        stage("Remove unused image") {
            steps {
                sh "docker rmi $imagename:$BUILD_NUMBER"
                sh "docker rmi $imagename:latest"
            }
        }
    }
}