package REST

import groovyx.net.http.RESTClient

def restApi = new RESTClient('http://localhost:8080/')
def queryString = "/reservations"

def response = restApi.get(path:queryString)

println "status code is ; " + response.status

println response.data

println "${response.data.id}"
println "${response.data.reservationNumber}"
println "${response.data.room}"

//if we try to access field that doesn't present in the data stream, it returns null
println "${response.data.foo}"
