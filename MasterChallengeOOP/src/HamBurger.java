public class HamBurger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private Additions additions;

    public HamBurger(String name, String breadRollType, String meat, double price, Additions additions) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.additions = additions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Additions getAdditions() {
        return additions;
    }

    public void setAdditions(Additions additions) {
        this.additions = additions;
    }

    public double calculateCostOfBurger(){
        return this.getPrice() + additions.calculateThePriceOfAdditions();
    }
}
