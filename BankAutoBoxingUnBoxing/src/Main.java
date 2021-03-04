import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        boolean flag = true;
        while (flag) {
            String branch;
            String customerName;
            double transaction;
            bank.displayMenu();
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Quitting");
                    flag = false;
                case 1:
                    System.out.println("Add a new branch");
                    System.out.println("Enter the branch name");
                    bank.addBranch(scanner.next());
                    break;
                case 2:
                    System.out.println("Add a new customer to a branch");
                    System.out.println("Enter the branch name : ");
                    branch = scanner.next();
                    System.out.println("Enter the customer name :");
                    customerName = scanner.next();
                    bank.addCustomer(branch, customerName);
                    break;
                case 3:
                    System.out.println("Add a transaction to a customer");
                    System.out.println("Enter the branch name : ");
                    branch = scanner.next();
                    System.out.println("Enter the customer name :");
                    customerName = scanner.next();
                    System.out.println("Enter the transaction: ");
                    transaction = scanner.nextDouble();
                    bank.addTransaction(branch, customerName, transaction);
                    break;
                case 4:
                    System.out.println("Print all the customers for a branch");
                    System.out.println("Enter the branch name");
                    branch = scanner.next();
                    bank.showCustomers(branch);
                    break;
                default:
                    System.out.println("Entered option does not exist , please wait for the options");
            }
        }
    }
}
