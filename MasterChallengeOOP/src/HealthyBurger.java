public class HealthyBurger extends HamBurger {

    private HealthyBurgerAdditions healthyBurgerAdditions;

    public HealthyBurger(String name, String breadRollType, String meat, double price, HealthyBurgerAdditions healthyBurgerAdditions) {
        super(name, breadRollType, meat, price, null);
        this.healthyBurgerAdditions = healthyBurgerAdditions;
    }

    public double calculateCostOfBurger(){
        return this.getPrice() + healthyBurgerAdditions.calculateThePriceOfAdditions();
    }
}
