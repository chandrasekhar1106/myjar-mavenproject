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
				
		stage("SCM Checkout") {
			steps {
				git 'https://github.com/chandrasekhar1106/myjar-mavenproject.git'
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
		failure {
			//Use this for failure scenario...
			mail bcc: '', body: 'Jenkins pipeline is failed.', cc: '', from: 'chandraganimisetty@gmail.com', replyTo: '', subject: 'Jenkins Pipeline sent this mail', to: 'sekharchandra2108@gmail.com'
		}
	}
}
