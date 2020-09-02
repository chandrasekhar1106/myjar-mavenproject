def buildApp() {
	sh 'mvn validate'
}

def testApp() {
	echo 'Testing the Application..'
}

def installApp() {
	echo 'Installing the Application..'
}

def deployApp() {
	echo 'Deploying the application..'
}
return this
