public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact( "Zarraf", "0175168630" );
        Contact contact2 = new Contact( "Zarra", "0175168638" );
        Contact contact3 = new Contact( "Zarr", "0175168608" );
        Contact contact4 = new Contact( "Easin", "0175168308" );

        MobilePhone mobilePhone = new MobilePhone("01751686308");
        System.out.println(mobilePhone.addNewContact(contact3));
        System.out.println(mobilePhone.addNewContact(contact1));
        System.out.println(mobilePhone.updateContact(contact1,contact4));
//        mobilePhone.addNewContact(contact1);
//        System.out.println(mobilePhone.queryContact("Zar"));
        mobilePhone.printContacts();


    }
}
