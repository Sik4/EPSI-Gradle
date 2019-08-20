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
            post {
                always {
                    junit '**/build/test-results/test/TEST-*.xml'
                }
            }
        }
  }
}
