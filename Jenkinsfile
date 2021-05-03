def modules = [:]
pipeline {
    agent  { node { label 'master' } }
    stages {
        stage('Environment') {
                steps {
                    script {
                        modules.util = load("${env.WORKSPACE}/scripts/build_util.groovy")
                        modules.util.exampleMethod()
                    }
                }
        }

        stage('test') {
                steps {
                    script {
                        modules.util.otherExampleMethod()
                    }
                }
        }
        stage('call') {
                steps {
                    script {
                        hello 'test hello world Shared Library DSL'
                    }
                }
        }
    }
}
