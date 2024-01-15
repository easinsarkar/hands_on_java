public class BankAccount {
    private String accountNumber = "BD 00.00.00.00";
    private double accountBalance = 0.0;
    private String customerName = " Easin";
    private String customerEmail = "email@email.com";
    private String phoneNumber = "01xxxxxxxxx";
    public BankAccount(String test){
        System.out.println(test);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    // setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
//getters
    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void accountInformation(){
        System.out.println("Your account information::\nAccount holder name: " + customerName
                + "\nAccount number: " +accountNumber
                +" \nTotal Balance: " + accountBalance
                +" \nPhone number: " +phoneNumber
                +"\nemail: " + customerEmail
        );
    }
    public double depositingFund(double depositedBalance){
        accountBalance = accountBalance+depositedBalance;
        System.out.println("After deposit of "+depositedBalance+" taka your balance is: "+accountBalance);
        return accountBalance;
    }
    public double withdrawingFund(double withdrawnBalance){
        if((accountBalance - withdrawnBalance)<0){
            System.out.println("Insufficient balance! You can withdraw at least "+ accountBalance + " taka");
        }else{
            accountBalance = accountBalance - withdrawnBalance;
            System.out.println("After withdraw of "+withdrawnBalance+" taka your balance is: "+accountBalance);
        }
        return accountBalance;
    }
}
