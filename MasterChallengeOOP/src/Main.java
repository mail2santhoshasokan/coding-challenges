import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().menu();
    }

    public void menu() {

        int orderMore = 1;
        while (orderMore > 0) {
            System.out.println("Welcome to Bills Burger !");
            System.out.println("1 -> HamBurger");
            System.out.println("2 -> HealthyBurger");
            System.out.println("3 -> DeluxeBurger");
            int burgerChoice = sc.nextInt();
            switch (burgerChoice) {
                case 1:
                    System.out.println("You have chosen HamBurger !");
                    sc.nextLine();
                    Additions additions = chooseAdditions();
                    HamBurger hamBurger = new HamBurger("HamBurger", "rye", "chicken", 6.0, additions);
                    System.out.println("Total cost" + hamBurger.calculateCostOfBurger());
                    break;
                case 2:
                    System.out.println("you have chosen Healthy Burger !");
                    sc.nextLine();
                    HealthyBurgerAdditions healthyBurgerAdditions = chooseHealthyBurgerAdditions();
                    HealthyBurger healthyBurger = new HealthyBurger("HealthyBurger", "sweetRound", "mutton", 10.0, healthyBurgerAdditions);
                    System.out.println("Total cost" + healthyBurger.calculateCostOfBurger());
                    break;
                case 3:
                    System.out.println("you have chosen Deluxe Burger !");
                    sc.nextLine();
                    DeluxeBurgerAdditions deluxeBurgerAdditions = chooseDeluxeBurgerAdditions();
                    DeluxeBurger deluxeBurger = new DeluxeBurger("DeluxeBurger", "fonsi", "pork", 15.0, deluxeBurgerAdditions);
                    System.out.println("Total cost" + deluxeBurger.calculateCostOfBurger());
                    break;
            }
            System.out.println("Enter 0 to place order 0r 1 to order more");
            orderMore = sc.nextInt();
        }
        sc.close();

    }

    public Additions chooseAdditions() {
        Additions additions = new Additions();
        System.out.println(additions.displayAdditionsAndPrice());
        System.out.println("Place Order -> press 0 && to keep adding additional press 9");
        int placeOrder = sc.nextInt();
        while (placeOrder > 0) {
            System.out.println("pls enter your additional choice");
            int additionalChoice = sc.nextInt();
            switch (additionalChoice) {
                case 1:
                    additions.setLettuce(true);
                    break;
                case 2:
                    additions.setTomato(true);
                    break;
                case 3:
                    additions.setPickles(true);
                    break;
                case 4:
                    additions.setPineapple(true);
                    break;
                default:
                    System.out.println("no additions chosen");
            }
            System.out.println("would you like to add more additional -> press 9 else 0 to place order");
            placeOrder = sc.nextInt();
        }
        return additions;
    }

    public HealthyBurgerAdditions chooseHealthyBurgerAdditions() {

        HealthyBurgerAdditions healthyBurgerAdditions = new HealthyBurgerAdditions();
        healthyBurgerAdditions.displayAdditionsAndPrice();
        System.out.println("Place Order -> press 0 && to keep adding additional press 9");
        int placeOrder = sc.nextInt();
        while (placeOrder > 0) {
            System.out.println("pls enter your additional choice");
            int additionalChoice = sc.nextInt();
            switch (additionalChoice) {
                case 1:
                    healthyBurgerAdditions.setLettuce(true);
                    break;
                case 2:
                    healthyBurgerAdditions.setTomato(true);
                    break;
                case 3:
                    healthyBurgerAdditions.setPickles(true);
                    break;
                case 4:
                    healthyBurgerAdditions.setPineapple(true);
                    break;
                case 5:
                    healthyBurgerAdditions.setEggs(true);
                    break;
                case 6:
                    healthyBurgerAdditions.setBacon(true);
                    break;
                default:
                    System.out.println("no additions selected");
            }
            System.out.println("would you like to add more additional -> press 9 else 0 to place order");
            placeOrder = sc.nextInt();
        }
        return healthyBurgerAdditions;
    }

    public DeluxeBurgerAdditions chooseDeluxeBurgerAdditions() {
        DeluxeBurgerAdditions deluxeBurgerAdditions = new DeluxeBurgerAdditions();
        deluxeBurgerAdditions.displayAdditionsAndPrice();
        System.out.println("Place Order -> press 0 && to add additional press 9");
        int placeOrder = sc.nextInt();
        while (placeOrder > 0) {
            System.out.println("pls enter your additional choice");
            int additionalChoice = sc.nextInt();
            switch (additionalChoice) {
                case 1:
                    deluxeBurgerAdditions.setChips(true);
                    break;
                case 2:
                    deluxeBurgerAdditions.setDrinks(true);
                    break;
                default:
                    System.out.println("no additions selected");
            }
            System.out.println("would you like to add more additional -> press 9 else 0 to place order");
            placeOrder = sc.nextInt();
        }
        return deluxeBurgerAdditions;
    }
}
