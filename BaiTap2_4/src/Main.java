public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(123, "Truong", 80);
        System.out.println(customer1.toString());
        Customer customer2 = new Customer(123, "Truong", 90);
        System.out.println(customer2.toString());
        System.out.println("id is "+ customer1.getId());
        System.out.println("name is "+ customer1.getName());
        System.out.println("discount is "+ customer1.getDiscount());

        Invoice invoice1 = new Invoice(789, customer1, 888.8);
        System.out.println(invoice1.toString());
        Invoice invoice2 = new Invoice(789, customer2, 999.9);
        System.out.println(invoice2.toString());
        System.out.println("id is "+ invoice1.getId());
        System.out.println("customer is "+ customer1.getName());
        System.out.println("amount is "+ invoice2.getAmount());
        System.out.println("customer's id is "+ customer2.getId());
        System.out.println("customer's name is "+ customer2.getName());
        System.out.println("customer's discount is "+ customer2.getDiscount());
        System.out.println("amount after discount is "+ invoice1.getAmountAfterDiscount());


    }
}
