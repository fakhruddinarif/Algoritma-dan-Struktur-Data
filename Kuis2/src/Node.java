public class Node {
    Truck truck;
    Node previous;
    Node next;

    public Node(Truck truck) {
        this.truck = truck;
        this.previous = null;
        this.next = null;
    }
}
