import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(calculator.getTotalCost());

    }

}
