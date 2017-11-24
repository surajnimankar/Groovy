package bank

class BankAccount {
    private balance;

    BankAccount(openingBalance) {
        balance = openingBalance
    }

    def void deposit(amount) {
        balance += amount
    }

    def void withdraw(amount) {
        if(amount > balance)
            throw new InsufficientFundException()
        balance -= amount
    }

    def void accrueInterest() {

        def service = new InterestRateService()
        def rate = service.getInterestRate()
        def accrueInterest = balance * rate

        deposit(accrueInterest)
    }
}
