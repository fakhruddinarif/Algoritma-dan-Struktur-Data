package Tugas;

public class List {
    int size;
    int top;
    Struk struk[];

    List(int size) {
        this.size = size;
        struk = new Struk[size];
        top = -1;
    }

    boolean IsEmpty() {
        if (top == -1) {
            return true;
        }
        else {
            return false;
        }
    }
    boolean IsFull() {
        if (top == size - 1) {
            return true;
        }
        else {
            return false;
        }
    }

    void push(Struk stk) {
        if (!IsFull()) {
            top++;
            struk[top] = stk;
        }
        else {
            System.out.println("Isi Stack Penuh");
        }
    }

    void pop() {
        if (!IsEmpty() && top > 3) {
            for (int i = top; i > top - 5; i--) {
                struk[i].display();
                System.out.println();
            }
            top -= 5;
        }
        else {
            System.out.println("Maaf Struk Anda Tidak Dapat Ditukar");
        }
    }

    void print() {
        System.out.println("Struk Yang Tersisa: ");
        for (int i = top; i >= 0; i--) {
            struk[i].display();
            System.out.println();
        }
    }
}
