import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;

    public Bank() {
        branches = new ArrayList<>();
    }

    public void displayMenu() {
        System.out.println("1 -> addBranch() \n"
                + "2 -> addNewCustomer() \n"
                + "3 -> addTransaction() \n"
                + "4 -> showCustomers() \n"
                + "0 -> quit");
    }

    public void addBranch(String branchName) {
        if (branchExists(branchName) < 0) {
            branches.add(new Branch(branchName));
        } else {
            System.out.println("Branch already exists");
        }
    }

    public void addCustomer(String branchName, String customerName) {
        int indexIfBranchExists = branchExists(branchName);
        if (indexIfBranchExists >= 0) {
            int indexIfCustomerExists = customerExists(customerName, indexIfBranchExists);
            if (indexIfCustomerExists < 0) {
                this.branches.get(indexIfBranchExists).addCustomer(customerName);
            } else {
                System.out.println("The customer with name " + customerName + " already exists");
            }
        } else {
            System.out.println("No branches with name " + branchName + "exists");
        }
    }

    public void addTransaction(String branchName, String customerName, double transaction) {
        int indexIfBranchExists = branchExists(branchName);
        if (indexIfBranchExists >= 0) {
            int indexIfCustomerExists = customerExists(customerName, indexIfBranchExists);
            if (indexIfCustomerExists >= 0) {
                this.branches.get(indexIfBranchExists).getCustomers().get(indexIfCustomerExists).addTransaction(transaction);
                System.out.println("Transaction added to the customer " + customerName);
            } else {
                System.out.println("Customer with name " + customerName + "don't exist");
            }
        }
    }

    public void showCustomers(String branchName) {
        int indexIfBranchExists = branchExists(branchName);
        if (indexIfBranchExists >= 0) {
            this.branches.get(indexIfBranchExists).printCustomersAndTransactions();
        } else {
            System.out.println("Branch with name " + branchName + " does not exist");
        }
    }

    public int branchExists(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public int customerExists(String customerName, int position) {
        for (int i = 0; i < this.branches.get(position).getCustomers().size(); i++) {
            if (this.branches.get(position).getCustomers().get(i).getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }
}
