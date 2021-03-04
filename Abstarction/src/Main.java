public class Main {
    public static void main(String[] args) {
        Linked linked = new Linked();
        linked.insert(1);
        linked.insert(2);
        linked.insert(3);

        linked.show();

        System.out.println("+++++++++++++++++++");

        linked.insertAtStart(8);

        linked.show();

        System.out.println("++++++++++++++++++++");

        linked.insertAt(2,10);

        linked.show();

        System.out.println("+++++++++++++++++");
        linked.delete(0);
        linked.show();

    }
}
