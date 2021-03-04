import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobilePhone mobilePhone = new MobilePhone();
        boolean flag = true;
        while (flag) {
            mobilePhone.menu();
            String name;
            String phoneNumber;
            System.out.println("Please enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Quit");
                    flag = false;
                    break;
                case 1:
                    System.out.println("Add new contact");
                    System.out.println("Please enter name");
                    name = scanner.next();
                    System.out.println("Please enter phone number");
                    phoneNumber = scanner.next();
                    mobilePhone.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.println("Modifying contact");
                    System.out.println("Please enter name");
                    name = scanner.next();
                    System.out.println("Please enter the new/updated phone number");
                    phoneNumber = scanner.next();
                    mobilePhone.modifyContact(name, phoneNumber);
                    break;
                case 3:
                    System.out.println("Delete contact");
                    System.out.println("Please enter the name of contact to be deleted");
                    name = scanner.next();
                    mobilePhone.deleteContact(name);
                    break;
                case 4:
                    System.out.println("search for a contact");
                    System.out.println("Please enter the name of contact to be searched");
                    name = scanner.next();
                    mobilePhone.searchContact(name);
                    break;
                case 5:
                    System.out.println("Printing all contacts");
                    mobilePhone.printListOfContacts();
                    break;
                case 6:
                    System.out.println("Available options are ");
                    mobilePhone.menu();
                default:
                    System.out.println("no options available , please enter 6 to view the available options");
            }
        }
        System.out.println("Quitting");
    }
}
