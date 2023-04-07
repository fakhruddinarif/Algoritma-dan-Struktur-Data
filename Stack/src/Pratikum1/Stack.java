package Pratikum1;

public class Stack {
    int size;
    int top;
    Pakaian data[];

    Stack(int size) {
        this.size = size;
        data = new Pakaian[size];
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

    void push(Pakaian pakaian) {
        if (!IsFull()) {
            top++;
            data[top] = pakaian;
        }
        else {
            System.out.println("Isi Stack Penuh");
        }
    }
    void pop() {
        if (!IsEmpty()) {
            Pakaian x = data[top];
            top--;
            System.out.println("Data Yang Keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        }
        else {
            System.out.println("Stack Masih Kosong");
        }
    }
    void peek() {
        System.out.println("Elemen Teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }
    void print() {
        System.out.println("Isi Stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
        }
        System.out.println();
    }
    void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack Sudah Dikosongkan");
        }
        else {
            System.out.println("Stack Masih Kosong");
        }
    }
    void getMin() {
        int minPrice = top;
        for (int i = top - 1; i >= 0; i--) {
            if (data[i].harga < data[minPrice].harga) {
                minPrice = i;
            }
        }
        System.out.println("Harga Pakaian Terendah Yaitu: Rp. " + data[minPrice].harga);
        System.out.println("Jenis: " + data[minPrice].jenis);
        System.out.println("Warna: " + data[minPrice].warna);
        System.out.println("Merk: " + data[minPrice].merk);
        System.out.println("Ukuran: " + data[minPrice].ukuran);
    }
}
