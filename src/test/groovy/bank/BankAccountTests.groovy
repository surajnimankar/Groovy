package bank

import groovy.mock.interceptor.MockFor

class BankAccountTests extends GroovyTestCase {

    private account

    def void setUp() {
        account = new BankAccount(10)
    }

    def void tearDown() {
        account = null
    }

    def void testCanDepositMoney() { //in groovy tes cases must start with test**** otherwise it won't be considered as test t run def account = new BankAccount(10)
        account.deposit(5)
        assert 15 == account.balance
    }

    def void testCanWithdrawMoney() {
        account.withdraw(5)
        assert 5 == account.balance
        //to prevent access to private fields of a class, override empty getter method
    }

    def void testCanNotWithdrawMoreMoneyThanBalance() {
        shouldFail(InsufficientFundException) {
            account.withdraw(15)
        }
    }

    def void testCanAccrueInterest() {
        def service = new MockFor(InterestRateService)
        service.demand.getInterestRate {
            return 0.10
        }
        service.use {
            account.accrueInterest()
            assert 11 == account.balance
        }
    }
}
