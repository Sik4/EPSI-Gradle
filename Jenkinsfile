pipeline {
  agent any
  stages {
        stage('Compile') {
            steps {
                sh './gradlew bootJar'
            }
        }
        stage('Unit Tests') {
            steps {
                sh './gradlew test'
            }
        }
  }
}