package adapter1;

public class Main {
    public static void main(String[] args) {
        BankAPI adaptee = new BankAPI();
        PaymentProcessor adapter = new BankAPIAdapter(adaptee, "123456");
        Client client = new Client(adapter);
        client.makePayment(100.00);
    }
}