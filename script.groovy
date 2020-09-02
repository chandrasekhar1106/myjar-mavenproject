def packageApp() {
	sh 'mvn package'
}
def installApp() {
	echo 'Installation stage is not necessary now'
}

def deployApp() {
	echo 'Deploy credentials need to update'
}
return this
