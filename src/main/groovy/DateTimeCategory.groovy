import org.joda.time.format.DateTimeFormat

class DateTimeCategory {

    def static String createPrintableDateTime(dateTime, suffix) {
        def format = DateTimeFormat.forPattern('MM/dd/yyyy - hh:mm aa')
        return dateTime.toString(format) + suffix
    }
}
