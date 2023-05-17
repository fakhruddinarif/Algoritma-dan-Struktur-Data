package Tugas2;

public class FilmList {
    Node head;
    int size;

    FilmList() {
        head = null;
        size = 0;
    }
    boolean IsEmpty() {
        return head == null;
    }
    void addFirst(Film film) {
        if (IsEmpty()) {
            head = new Node(null, film, head);
        }
        else {
            Node newNode = new Node(null, film, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    void addLast(Film film) {
        if (IsEmpty()) {
            addFirst(film);
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, film, null);
            current.next = newNode;
            size++;
        }
    }
    void add(Film film, int index) throws ExceptionInInitializerError {
        if (IsEmpty()) {
            addFirst(film);
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
                Node newNode = new Node(null, film, current);
                current.prev = newNode;
                head = newNode;
            }
            else {
                Node newNode = new Node(current.prev, film, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
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
    void print() {
        if (IsEmpty()) {
            System.out.println("Antrian Kosong");
        }
        else {
            Node current = head;
            while (current != null) {
                System.out.println("ID     : " + current.data.id);
                System.out.println("Judul  : " + current.data.judul);
                System.out.println("Rating : " + current.data.rating);
                System.out.println();
                current = current.next;
            }
        }
    }
    int getNode(int id) {
        int position = -1;
        if (IsEmpty()) {
            System.out.println("Tidak Ada Data");
        }
        Node data = head;
        for (int i = 0; i < size; i++) {
            if (data.data.id == id) {
                return position = i + 1;
            }
            data = data.next;
        }
        return position;
    }
    Film search(int id) {
        Node current = head;
        while (current != null) {
            if (current.data.id == id) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }
    void sortFilm() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        while (current.next != null) {
            Node maxFilm = current;
            Node temp = new Node(null, new Film(0, "", 0), null);

            while (maxFilm.next != null) {
                maxFilm = maxFilm.next;
                if (maxFilm.data.rating > current.data.rating) {
                    temp.data = maxFilm.data;
                    maxFilm.data = current.data;
                    current.data = temp.data;
                }
            }
            current = current.next;
        }
        System.out.println("Daftar Film setelah diurutkan berdasarkan Rating secara descending:");
        print();
    }
}
