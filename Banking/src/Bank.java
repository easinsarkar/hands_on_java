import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }
    public boolean addBranch(String branchName) {

    }
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {

    }
    public boolean addCustomerTransaction( String branchName, String customerName, double initialTransaction) {

    }
    private Branch findBranch(String branchName) {

    }
    public boolean listCustomers(String branchName, boolean printTransaction) {

    }
}
