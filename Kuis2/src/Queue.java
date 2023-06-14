public class Queue {
    private Node head;
    private Node tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(Truck truck) {
        Node newNode = new Node(truck);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public Truck dequeue() {
        if (isEmpty()) {
            return null;
        }

        Truck dequeuedTruck = head.truck;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }
        return dequeuedTruck;
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.print("Sisa antrian truk nomor: ");
        Node current = head;
        while (current != null) {
            System.out.printf("%d\t", current.truck.truckNumber);
            current = current.next;
        }
        System.out.println();
    }

    int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
