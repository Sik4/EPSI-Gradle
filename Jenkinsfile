pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        gradlew('bootJar')
      }
    }
  }
}