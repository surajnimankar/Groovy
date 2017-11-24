import org.joda.time.DateTime

println("Hello Groovy World...!")
println "today's date is: " + new Date()

use(DateTimeCategory) {
    def prinatabeDate = new DateTime(new Date())
    println prinatabeDate.createPrintableDateTime(" Hello Date Time..!")
}



