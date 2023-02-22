pipeline {
    agent any
        tools {
            maven 'maven-3.6.3'
        }
        stages {
            stage('Build Maven') {
                steps {
                    checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/AnandBabuSpk/docker-pipeline-test']])
                    bat 'mvn clean install'
                }
            }
            stage('Build docker image') {
                steps {
                    bat 'docker build -t anandbabu18/docker-devops-integration .'
                }
            }
            stage('Push docker image to hub') {
                steps {
                    withDockerRegistry([ credentialsId: "docker-hub-user", url: "https://registry.hub.docker.com" ]) {
                    bat 'docker push anandbabu18/docker-devops-integration'
 
                    }
                }
            }

        }
}
