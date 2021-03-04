import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts;

    public MobilePhone() {
        contacts = new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void printListOfContacts() {
        for (int i = 0; i < this.contacts.size(); i++) {
            System.out.println("name : " + contacts.get(i).getName() + ", phoneNumber : " + contacts.get(i).getPhoneNumber());
        }
    }

    public void menu() {
        System.out.println("0 -> quit \n"
                + "1 -> Add a contact \n"
                + "2 -> modifyContact \n"
                + "3 -> deleteContact \n"
                + "4 -> searchContact \n"
                + "5 -> printListOfContacts");
    }

    public void addContact(String name, String phoneNumber) {
        int indexIfPresent = isContactPresent(name);
        if (indexIfPresent >= 0) {
            System.out.println("contact is already present and updating with the number entered");
            this.contacts.get(indexIfPresent).setPhoneNumber(phoneNumber);
        } else {
            System.out.println("Adding new phone number");
            this.contacts.add(new Contact(name, phoneNumber));
            System.out.println("Contact : " + name + " added");
        }
    }

    public void deleteContact(String name) {
        int indexIfPresent = isContactPresent(name);
        if (indexIfPresent >= 0) {
            this.contacts.remove(indexIfPresent);
            System.out.println("Contact name : " + name + " deleted");
        } else {
            System.out.println("Contact with name " + name + " doesn't exist");
        }
    }

    public void modifyContact(String name, String phoneNumber) {
        int indexIfPresent = isContactPresent(name);
        if (indexIfPresent >= 0) {
            System.out.println("contact is present and updating with the number entered");
            this.contacts.get(indexIfPresent).setPhoneNumber(phoneNumber);
        } else {
            System.out.println("contact with name " + name + " not present , pls create a new contact");
        }
    }

    public void searchContact(String name) {
        if (isContactPresent(name) >= 0) {
            System.out.println("contact with name " + name + " is present");
        }else{
            System.out.println("contact with name " + name + " is not present");
        }
    }


    public int isContactPresent(String name) {
        int index = -1;
            for (int i = 0; i < this.contacts.size(); i++) {
                if (name.equals(this.contacts.get(i).getName())) {
                    index = i;
                }
            }
        return index;
    }
}
