pipeline {
    agent any

    stages {
        stage ('Compile Stage1') {

            steps {
                withMaven(maven : 'apache-maven-3.6.0') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage2') {

            steps {
                withMaven(maven : 'apache-maven-3.6.0') {
                    bat 'mvn test'
                }
            }
        }


        stage ('Install Stage3') {
            steps {
                withMaven(maven : 'apache-maven-3.6.0') {
                    bat 'mvn install'
                }
            }
        }
    }
}
