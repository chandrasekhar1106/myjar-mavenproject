def gv

pipeline {
	agent any
	
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
}
