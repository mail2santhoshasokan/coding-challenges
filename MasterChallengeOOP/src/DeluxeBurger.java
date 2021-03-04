public class DeluxeBurger extends HamBurger {

    private DeluxeBurgerAdditions deluxeBurgerAdditions;

    public DeluxeBurger(String name, String breadRollType, String meat, double price, DeluxeBurgerAdditions deluxeBurgerAdditions) {
        super(name, breadRollType, meat, price, null);
        this.deluxeBurgerAdditions = deluxeBurgerAdditions;
    }

    public double calculateCostOfBurger(){
        return this.getPrice() + deluxeBurgerAdditions.calculateThePriceOfAdditions();
    }

}
