public class Main {

    public static void main(String[] args) {
        HatchBack hatchBack = new HatchBack(1,1800,85,"manual", 5,"threeSpoke","porsche","magnesium", 4,5,"carrera",1400,"petrol",100,5);

        hatchBack.changingGears(1);
        hatchBack.handleSteering("left");

    }
}
