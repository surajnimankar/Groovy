def resourcesFile = new File("Credentials.groovy")
def configSlurper = new ConfigSlurper()
def credentials = configSlurper.parse(resourcesFile.toURL())

println credentials
println "Following are the credentials defned...."
println credentials.api_Key
println credentials.api_User
println credentials.api_password
