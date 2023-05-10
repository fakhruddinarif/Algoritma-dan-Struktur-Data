package TugasNomor2;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList ssl = new SingleLinkedList();

        ssl.addFirst("A");
        ssl.print();
        ssl.addLast("E");
        ssl.print();
        ssl.insertAfter("A", "B");
        ssl.print();
        ssl.insertAt(2, "C");
        ssl.print();
        ssl.insertAfter("C", "D");
        ssl.print();

    }
}
