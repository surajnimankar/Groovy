def numbers = 0..9
for(number in numbers) {
    if(isEven(number)) {
        println number
    }

}

def isEven(number) {
    number % 2 == 0  // no need to have return statement as it is automatically returned the result to caller function
}