def numbers = 1..10
for(num in numbers) {
    println num
}

println "*******************"

def letters = 'a'..'g'
for(letter in letters) {
    println letter
}

println "*******************"

def enum days {
    SUN,
    MON,
    TUE,
    WED,
    THR,
    FRI,
    SAT
}
def weekdays = days.MON..days.FRI
for(day in weekdays) {
    println day
}

println "*******************"

println "Extends: "
println weekdays.from
println weekdays.to