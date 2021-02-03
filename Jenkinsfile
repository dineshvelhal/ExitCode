pipeline {
	agent any
	
	stages {
		stage('EXIT_CODE_O') {
			steps {
				sh 'java -jar ExitCode.jar 0 '
			}
		}
		
		stage('EXIT_CODE_1') {
			steps {
				sh 'java -jar ExitCode.jar 1 '
			}
		}
	}
}