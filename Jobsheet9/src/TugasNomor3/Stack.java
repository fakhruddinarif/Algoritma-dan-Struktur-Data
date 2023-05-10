package TugasNomor3;

public class Stack {
    Node top;
    int size;

    Stack() {
        this.top = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return top == null;
    }
    void push(MataKuliah data) {
        Node ndInput = new Node(data, null);
        if (isEmpty()) {
            top = ndInput;
        }
        else {
            ndInput.next = top;
            top = ndInput;
        }
        size++;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Data Masih Kosong");
            return;
        }
        top = top.next;
        size--;
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Data Masih Kosong");
            return;
        }
        System.out.println("Mata Kuliah: " + top.data);
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = top;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data.namaMatkul + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
        else {
            System.out.println("Linked List Kosong");
        }
    }
}
