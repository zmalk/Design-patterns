package adapter1;

// The adaptee class that the client class wants to use, but has an incompatible interface
class BankAPI {
    public void processBankPayment(String bankAccount, double amount) {
        // Some code to process the payment through the bank's API
    }
}