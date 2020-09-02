def buildApp() {
	sh 'mvn validate'
}

def compileApp() {
	sh 'mvn compile'
}

def testApp() {
	sh 'mvn test'
}

def installApp() {
	sh 'mvn install'
}

def deployApp() {
	echo 'Deploy credentials need to update'
}
return this
