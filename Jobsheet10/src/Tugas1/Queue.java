package Tugas1;

public class Queue {
    Node front, rear;

    Queue() {
        this.front = null;
        this.rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }
    void enqueue(Pasien pasien) {
        Node newNode = new Node(null, pasien, null);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        }
        else {
            newNode.next = rear;
            rear.prev = newNode;
            rear = newNode;
        }
    }
    Node dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return null;
        }
        else {
            Node tmp = front;
            front = front.prev;
            if (front == null) {
                rear = null;
            }
            else {
                front.next = null;
            }
            return tmp;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        }
        else {
            Node current = rear;
            System.out.println("=======================");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("=======================");
            System.out.printf("|%-10s|%-10s|\n", "NO", "NAMA");
            while (current != null) {
                System.out.printf("|%-10d", current.data.nomor);
                System.out.printf("|%-10s|\n", current.data.nama);
                current = current.next;
            }
            System.out.println("=======================");
        }
    }
    int get() {
        if (isEmpty()) {
            return 0;
        }
        else {
            int count = 0;
            Node current = front;
            while (current != null) {
                count++;
                current = current.prev;
            }
            return count;
        }
    }
}
