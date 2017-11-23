def file = new File("../data/Parts.xml")
println file.exists()

def slurper = new XmlSlurper()
def xml = slurper.parse(file)
println xml

println xml.TITLE
println ''
println xml.desc
println ''
println xml.foo   // it doesn't return any error even if foo is nt a valid element of xml file.

println ''
println xml.@version
println ''
println xml.@creator

println ''
println xml.PARTS.@info

xml.PARTS.each {
    println it.ITEM

}

