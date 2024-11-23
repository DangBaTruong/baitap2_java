public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(123, "Truong", 'm');
        System.out.println(customer.toString());
        Account account = new Account(123, customer, 123.12);
        System.out.println(account.toString());
        System.out.println("id is " + account.getId());
        System.out.println("customer name is " + account.getCustomerName());
        System.out.println("balance is " + account.getBalance());
        account.setBalance(500.7);
        System.out.println(account.toString());
        System.out.println("balance after set balance is " + account.getBalance());
        System.out.println("deposit is " + account.deposit(500.7));
        System.out.println("withdraw is " + account.withdraw(500.7));
    }
}