public class Main {
    public static void main(String[] args){
        Customer easin = new Customer("easin ali sarkar",10000,"test.easin@test.com");
        System.out.println(easin.getCreditLimit());

        Customer abdullah = new Customer("abdullah","test.abdullah@test.com");
        System.out.println(abdullah.getCreditLimit());
        System.out.println(abdullah.getEmailAddress());

        Customer emptyCustomer = new Customer();
        System.out.println(emptyCustomer.getCreditLimit());
        System.out.println(emptyCustomer.getName());
        System.out.println(emptyCustomer.getEmailAddress());
    }
}
