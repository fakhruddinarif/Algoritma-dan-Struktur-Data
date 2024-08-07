package TugasNomor2;

public class SingleLinkedList {
    Node head; // Posisi Awal Linked List
    Node tail; // Posisi Akhir Linked List

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
        else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(String input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            // Head dan Tail sama dengan Node Input
            head = ndInput;
            tail = ndInput;
        }
        else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(String input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            // Head dan Tail sama dengan Node Input
            head = ndInput;
            tail = ndInput;
        }
        else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(String key, String input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, String input) {
        if (index < 0) {
            System.out.println("Index Salah");
        }
        else if (index == 0) {
            addFirst(input);
        }
        else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }
}
