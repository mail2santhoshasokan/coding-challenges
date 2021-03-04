public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        this.balance = this.balance + amount;
        System.out.println("The total balance after depositing " + amount + " is " + this.balance);
    }

    public void withdrawFunds(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient Funds");
        } else {
            System.out.println("Withdrawing amount " + amount);
            this.balance -= amount;
            System.out.println("balance is " + this.balance);
        }

    }

}
