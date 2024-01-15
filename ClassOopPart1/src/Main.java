public class Main {
    public static void main(String[] args){
        BankAccount bankAccount1 = new BankAccount("test");
        bankAccount1.setAccountNumber("BD 12.12.12.12");
        bankAccount1.setCustomerName("ABDULLAH");
        bankAccount1.setCustomerEmail("test@test.com");
        bankAccount1.setPhoneNumber("01777788887");
        bankAccount1.depositingFund(100000.00);
        bankAccount1.withdrawingFund(7878);
        bankAccount1.accountInformation();
        System.out.println(bankAccount1);
        recordBankAccount recordAccount = new recordBankAccount("12121212",123456,
                "easin","test@test.com","0123456789");
        System.out.println(recordAccount);
        System.out.println(recordAccount.accountBalance());
    }
}
