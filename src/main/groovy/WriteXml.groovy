def inFile = new File("../data/Parts.xml")
def slurper = new XmlSlurper()
def inXml = slurper.parse(inFile)

def markupBuilder = new groovy.xml.StreamingMarkupBuilder()
def xml = markupBuilder.bind {
    body {
        mkp.comment("this is comment")   // mkp inbuilt variable for xml creation
        infomration (info: "Hello World") {
            Version(inXml.@version)
            Creator(inXml.@creator)
            Description(inXml.desc)
        }
    }

}

def outFile = new File('../data/Write.xml')
outFile.write(xml.toString())