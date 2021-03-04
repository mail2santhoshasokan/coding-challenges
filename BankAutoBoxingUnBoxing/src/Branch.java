import java.util.ArrayList;

public class Branch {

    private String branchName;

    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers.add(new Customer());
    }

    public Branch(String branchName, ArrayList<Customer> customers) {
        this.branchName = branchName;
        this.customers = customers;
    }

    public void addCustomer(String name) {
        this.customers.add(new Customer(name));
    }

    public void printCustomersAndTransactions(){
        for (int i=0;i<this.customers.size();i++){
            System.out.println("customerName" + this.getCustomers().get(i).getName());
            System.out.println("The transactions are : ");
            for (int j=0;j<this.getCustomers().get(i).getTransactions().size();j++){
                System.out.println(this.getCustomers().get(i).getTransactions().get(j).doubleValue());
            }
        }
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
