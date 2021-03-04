public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(true, 100);
        printer.printPages(20);
        printer.printPages(100);
        printer.fillUpTheToner(50);
    }
}

