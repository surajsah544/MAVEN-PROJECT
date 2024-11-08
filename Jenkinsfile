pipeline {
    agent any
    tools {
        jdk 'JDK21'
        maven 'MVN'
    }
    stages {
        stage ('checkout') {
            steps {
             git branch: 'main', credentialsId: '2419ea90-96fd-4bda-b485-028c0e499382', url: 'https://github.com/surajsah544/MEVAN_PROJECT.git'   
            }
        }
        stage ('build ') {
            steps {
                bat 'mvn clean'
            }
        }
        stage ('validate') {
            steps {
                bat 'mvn validate'
            }
        }
         stage ('compile') {
            steps {
                bat 'mvn compile'
            }
        }
         stage ('install') {
            steps {
                bat 'mvn install'
            }
        }
    }
}
