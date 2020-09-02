def gv

pipeline {
	agent any
	tools {
		maven 'Maven'
	}
	
	stages {
		stage("init") {
			steps {
				script {
					gv = load "script.groovy"
				}
			}
		}
		
		stage("build") {
			steps {
				script {
					gv.buildApp()
				}
			}
		}
		
		stage("compile") {
			steps {
				script {
					gv.compileApp()
				}
			}
		}
		
		stage("test") {
			steps {
				script {
					gv.testApp()
				}
			}
		}
		
		stage("install") {
			steps {
				script {
					gv.installApp()
				}
			}
		}
		
		stage("deploy") {
			steps {
				script {
					gv.deployApp()
				}
			}
		}
	}
	post {
		always {
			//Use this for always scenario...
		}
		
		success {
			stages {
				stage ("Email Notification") {
					steps {
						mail bcc: '', body: 'Jenkins pipeline is done successfully.', cc: '', from: 'chandraganimisetty@gmail.com', replyTo: '', subject: 'Jenkins Pipeline sent this mail', to: 'sekharchandra2108@gmail.com'
					}
				}
			}
		}
	}
}
