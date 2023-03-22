package adapter1;

// The client class that uses the adapter class to work with the adaptee class
class Client {
    PaymentProcessor paymentProcessor;

    public Client(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {
        paymentProcessor.processPayment(amount);
    }
}