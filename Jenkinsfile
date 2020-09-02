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
		
		stage("package") {
			steps {
				script {
					gv.packageApp()
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
			//Use this for always scenario...
			mail bcc: '', body: 'Jenkins pipeline is done successfully.', cc: '', from: 'chandraganimisetty@gmail.com', replyTo: '', subject: 'Jenkins Pipeline sent this mail', to: 'sekharchandra2108@gmail.com'
		}
		success {
			//deploying on server using ssh
			sshPublisher(publishers: [sshPublisherDesc(configName: 'tomcat', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '//opt//JAR', remoteDirectorySDF: false, removePrefix: 'target', sourceFiles: '**/*.jar')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
		}	
	}
}
