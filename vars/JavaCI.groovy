def call(Closure body){
    pipeline {
        agent any
        stages {
            stage('Hello') {
                steps {
                    echo 'Hello World'
                    body()
                }
            }
        }
    }
}