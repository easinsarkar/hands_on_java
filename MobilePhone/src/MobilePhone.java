import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;

        this.myContacts = new ArrayList<>();
        myContacts.add(new Contact( "Zarraf", "0175168630" ));
        myContacts.add(new Contact( "Zarra", "0175168638" ));
    }
    public boolean addNewContact(Contact contact) {
        for (Contact existing : myContacts) {
            if (existing.equals(contact))
                return false;
        }
        return true;
    }
    public boolean updateContact( Contact oldContact, Contact newContact) {
        boolean flag1 = false;
        if (!addNewContact(oldContact)) {
            flag1 = true;
            myContacts.set(myContacts.indexOf(oldContact), newContact);
        }
        boolean flag2 = addNewContact(oldContact);
        return flag1 && flag2;
    }

    public boolean removeContact(Contact contact) {
        boolean flag1 = false;
        if (!addNewContact(contact)) {
            myContacts.remove(contact);
            flag1 = true;
        }
        boolean flag2 = addNewContact(contact);
        return flag1 && flag2;
    }
    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }
    private int findContact(String stringInput) {
        int index = -1;
        for ( int i = 0 ; i < myContacts.size(); i++) {
            if (Objects.equals((myContacts.get(i)).getName(), stringInput)) {
                index = i;
            }
        }
        return index;
    }
    public Contact queryContact(String stringInput) {
        int index = findContact( stringInput );
        if ( index >= 0) {
            return myContacts.get(index);
        } else {
            return null;
        }
    }
    public void printContacts() {
        System.out.println("Contact List:");
        for ( int i = 0 ; i < myContacts.size(); i++) {
            System.out.println( (i+1) + ". " + (myContacts.get(i)).getName() + " -> " + (myContacts.get(i)).getPhoneNumber() );
        }

    }
}
