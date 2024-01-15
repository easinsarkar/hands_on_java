public class Customer {
    private String name ="Customer name";
    private double creditLimit = 0.0;
    private String emailAddress= "test@test.com";

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("base constructor");
    }
    public Customer() {
        this("Easin",100000.00,"test1@test.com");
        System.out.println("no args constructor");
    }

    public Customer(String name, String emailAddress) {
        this(name,11111111.11,emailAddress);
        System.out.println("constructor with name and email");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
