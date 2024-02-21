public class Main {
    public static void main(String[] args) {
        // Creating an instance of CreditCard
        CreditCard myCreditCard = new CreditCard("Joe Biden", "Example Bank", "123456789", 1000);

        // Accessing methods
        System.out.println("Customer: " + myCreditCard.getCustomer());
        System.out.println("Bank: " + myCreditCard.getBank());
        System.out.println("Account: " + myCreditCard.getAccount());
        System.out.println("Limit: $" + myCreditCard.getLimit());
        System.out.println("Balance: $" + myCreditCard.getBalance());

        // Making charges and payments
        myCreditCard.charge(1000);
        myCreditCard.charge(2000);
        myCreditCard.makePayment(500);

        // Checking updated balance
        System.out.println("Updated Balance: $" + myCreditCard.getBalance());
    }
}
