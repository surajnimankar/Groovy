import org.joda.time.*
import org.joda.time.format.DateTimeFormat


println("Hello Groovy World...!")
println "today's date is: " + new Date()


def prinatabeDate = new DateTime(new Date())
def format = DateTimeFormat.forPattern('MM/dd/yyyy - hh:mm aa')

println prinatabeDate.toString(format)

