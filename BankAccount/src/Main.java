public class Main {
    public static void main(String[] args) {
       /* BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(1234);
        bankAccount.setBalance(5000);
        bankAccount.setCustomerName("Santhosh Asokan");
        bankAccount.setEmail("mail2santhoshasokan@gmail.com");
        bankAccount.setPhoneNumber(9500458457L);

        bankAccount.getBalance();
        bankAccount.depositFunds(2000);
        bankAccount.withdrawFunds(4000);
        bankAccount.withdrawFunds(5000);*/

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmailAddress());

        VipCustomer vipCustomer1 =  new VipCustomer("santhosh", 200000);
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getCreditLimit());
        System.out.println(vipCustomer1.getEmailAddress());

        VipCustomer vipCustomer2 =  new VipCustomer("prevashnee", 100000, "prevashneeMoodley@gmail.com");
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println(vipCustomer2.getEmailAddress());
    }
}
