import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer() {
        this.name = "default";
        transactions.add(Double.valueOf(0.00));
    }

    public Customer(String name) {
        this.name = name;
        this.transactions.add(Double.valueOf(0.0));
    }

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(Double.valueOf(transaction));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
}
