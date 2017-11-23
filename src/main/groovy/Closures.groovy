def myClosure = {
    println "in a Closure.."
    println new Date()
}

for(i in 1..3) {
    myClosure()
    sleep(1000)
}
println "**************"

(1..3).each({
    println "in a Closure: $it"  // inbuilt it variable gives an access to current iteration value
})

println "**************"

(1..3).each({ i ->
    println "in a Closure: $i"
})

println "**************"

(1..10).findAll({ it % 2 == 0}).each({
    println "in a Closure: $it"
})

