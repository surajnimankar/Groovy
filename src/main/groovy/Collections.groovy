def names = ["Suraj", "Sachin", "Pranav"]
for(def i=0;i<names.size();i++) {
    def greetings = "Hello "
    println  "$greetings"+ names[i]
    println  "$greetings"+ "${names[i]}"
}
println "*************************"
for(name in names) {
    println "Hello " + name
    println "Hello " + "$name"
}
