package adapter1;

public class BankAPIAdapter implements PaymentProcessor{
    BankAPI bankAPI;
    String bankAccount;

    public BankAPIAdapter(BankAPI bankAPI, String bankAccount) {
        this.bankAPI = bankAPI;
        this.bankAccount = bankAccount;
    }

    @Override
    public void processPayment(double amount) {
        bankAPI.processBankPayment(bankAccount, amount);
    }
}