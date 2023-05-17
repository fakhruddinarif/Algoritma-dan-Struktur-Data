package DoubleLinkedList;

public class DoubleLinkedList {
    Node head;
    int size;

    DoubleLinkedList() {
        head = null;
        size = 0;
    }

    boolean IsEmpty() {
        return head == null;
    }
    void addFirst(int item) {
        if (IsEmpty()) {
            head = new Node(null, item, head);
        }
        else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    void addLast(int item) {
        if (IsEmpty()) {
            addFirst(item);
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    void add(int item, int index) throws ExceptionInInitializerError {
        if (IsEmpty()) {
            addFirst(item);
        }
        else if (index < 0 || index > size) {
            throw new ExceptionInInitializerError("Nilai Index Diluar Batas");
        }
        else {
            Node current = head;
            int i = 0;
            while (i  < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            }
            else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    int size() {
        return size;
    }
    void clear() {
        head = null;
        size = 0;
    }
    void print() {
        if (!IsEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil Diisi");
        }
        else  {
            System.out.println("Linked List Kosong");
        }
    }

    void removeFirst() throws ExceptionInInitializerError {
        if (IsEmpty()) {
            throw new ExceptionInInitializerError("Linked List Masih Kosong, Tidak Dapat Dihapus");
        }
        else if (size == 1) {
            removeLast();
        }
        else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    void removeLast() throws ExceptionInInitializerError {
        if (IsEmpty()) {
            throw new ExceptionInInitializerError("Linked List Masih Kosong, Tidak Dapat Dihapus");
        }
        else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    void remove(int index) throws ExceptionInInitializerError {
        if (IsEmpty() || index >= size) {
            throw new ExceptionInInitializerError("Nilai Index Di Luar Batas");
        }
        else if (index == 0) {
            removeFirst();
        }
        else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            }
            else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            }
            else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    int getFirst() throws ExceptionInInitializerError {
        if (IsEmpty()) {
            throw new ExceptionInInitializerError("Linked List Kosong");
        }
        return head.data;
    }
    int getLast() throws ExceptionInInitializerError {
        if (IsEmpty()) {
            throw new ExceptionInInitializerError("Linked List Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    int get(int index) throws ExceptionInInitializerError {
        if (IsEmpty() || index >= size) {
            throw new ExceptionInInitializerError("Nilai Index Diluar Batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
