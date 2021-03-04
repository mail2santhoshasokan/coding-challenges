public class Additions {
    private boolean lettuce;
    private boolean tomato;
    private boolean pickles;
    private boolean pineapple;
    private double priceOfLettuce;
    private double priceOfTomato;
    private double priceOfPickles;
    private double priceOfPineapple;

    public Additions() {
        this.priceOfLettuce = 2.0;
        this.priceOfTomato = 1.5;
        this.priceOfPickles = 3.0;
        this.priceOfPineapple = 4.0;
    }

    public Additions(boolean lettuce, boolean tomato, boolean pickles, boolean pineapple) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickles = pickles;
        this.pineapple = pineapple;
        this.priceOfLettuce = 2.0;
        this.priceOfTomato = 1.5;
        this.priceOfPickles = 3.0;
        this.priceOfPineapple = 4.0;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setPickles(boolean pickles) {
        this.pickles = pickles;
    }

    public void setPineapple(boolean pineapple) {
        this.pineapple = pineapple;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isPickles() {
        return pickles;
    }

    public boolean isPineapple() {
        return pineapple;
    }

    public double getPriceOfLettuce() {
        return priceOfLettuce;
    }

    public double getPriceOfTomato() {
        return priceOfTomato;
    }

    public double getPriceOfPickles() {
        return priceOfPickles;
    }

    public double getPriceOfPineapple() {
        return priceOfPineapple;
    }

    public String displayAdditionsAndPrice() {
        return "Pls choose from the additions"+"\n"
                +"1.lettuce" + this.getPriceOfLettuce() + "\n"
                + "2.tomato" + this.getPriceOfTomato() + "\n"
                + "3.pickles" + this.getPriceOfPickles() + "\n"
                + "4.pineapple" + this.getPriceOfPickles();
    }

    public double calculateThePriceOfAdditions() {
        double cost = 0;
        if (isLettuce()) {
            cost += this.getPriceOfLettuce();
        }
        if (isTomato()) {
            cost += this.getPriceOfTomato();
        }
        if (isPickles()) {
            cost += this.getPriceOfPickles();
        }
        if (isPineapple()) {
            cost += this.getPriceOfPineapple();
        }
        return cost;
    }
}

class HealthyBurgerAdditions extends Additions {

    private boolean bacon;
    private boolean eggs;
    private double priceOfBacon;
    private double priceOfEggs;

    public HealthyBurgerAdditions() {
        this.priceOfBacon = 5.0;
        this.priceOfEggs = 4.0;
    }

    public HealthyBurgerAdditions(boolean lettuce, boolean tomato, boolean pickles, boolean pineapple, boolean bacon, boolean eggs) {
        super(lettuce, tomato, pickles, pineapple);
        this.bacon = bacon;
        this.eggs = eggs;
        this.priceOfBacon = 5.0;
        this.priceOfEggs = 4.0;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public void setEggs(boolean eggs) {
        this.eggs = eggs;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isEggs() {
        return eggs;
    }

    public double getPriceOfBacon() {
        return priceOfBacon;
    }

    public double getPriceOfEggs() {
        return priceOfEggs;
    }

    public String displayAdditionsAndPrice() {
        return "Pls choose from the additions"
                +"lettuce" + this.getPriceOfLettuce() + "\n"
                + "tomato" + this.getPriceOfTomato() + "\n"
                + "pickles" + this.getPriceOfPickles() + "\n"
                + "pineapple" + this.getPriceOfPickles() + "\n"
                + "bacon" + this.getPriceOfBacon() + "\n"
                + "eggs" + this.getPriceOfEggs();
    }

    public double calculateThePriceOfAdditions() {
        double cost = 0;
        if (isLettuce()) {
            cost += this.getPriceOfLettuce();
        }
        if (isTomato()) {
            cost += this.getPriceOfTomato();
        }
        if (isPickles()) {
            cost += this.getPriceOfPickles();
        }
        if (isPineapple()) {
            cost += this.getPriceOfPineapple();
        }
        if (isBacon()) {
            cost += this.getPriceOfBacon();
        }
        if (isEggs()) {
            cost += this.getPriceOfEggs();
        }
        return cost;
    }
}

class DeluxeBurgerAdditions extends Additions {
    private boolean chips;
    private boolean drinks;
    private double priceOfChips;
    private double priceOfDrinks;

    public DeluxeBurgerAdditions() {
        this.priceOfChips = 2.5;
        this.priceOfDrinks = 0.5;
    }

    public DeluxeBurgerAdditions(boolean chips, boolean drinks) {
        super(false, false, false, false);
        this.chips = chips;
        this.drinks = drinks;
        this.priceOfChips = 2.5;
        this.priceOfDrinks = 0.5;
    }

    public void setChips(boolean chips) {
        this.chips = chips;
    }

    public void setDrinks(boolean drinks) {
        this.drinks = drinks;
    }

    public boolean isChips() {
        return chips;
    }

    public boolean isDrinks() {
        return drinks;
    }

    public double getPriceOfChips() {
        return priceOfChips;
    }

    public double getPriceOfDrinks() {
        return priceOfDrinks;
    }

    public String displayAdditionsAndPrice() {
        return "Pls choose from the additions"+
                "chips" + this.getPriceOfChips() + "\n"
                + "drinks" + this.getPriceOfDrinks();
    }

    public double calculateThePriceOfAdditions() {
        double cost = 0;
        if (isChips()) {
            cost += this.getPriceOfChips();
        }
        if (isDrinks()) {
            cost += this.getPriceOfDrinks();
        }
        return cost;
    }

}
