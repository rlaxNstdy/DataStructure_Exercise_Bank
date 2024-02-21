public class CreditCard {
    // Fields
    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;

    // Constructor
    public CreditCard(String customer, String bank, String account, int limit) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = 0.0;

    }
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double price) {
        if (price > 0 && (balance + price) <= limit) {
            balance += price;
            System.out.println("Charge of $" + price + " successful. New balance is $" + balance);
            return true;
        } else {
            System.out.println("Charge failed. Insufficient credit or invalid amount.");
            return false;
        }
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Payment of $" + amount + " made. Now the balance is $" + balance);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }
}
