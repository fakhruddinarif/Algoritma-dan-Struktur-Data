package Praktikum2;

public class Queue {
    int max, size, front, rear;
    Penumpang Q[];

    Queue(int n) {
        max = n;
        Create();
    }

    void Create() {
        Q = new Penumpang[max];
        size = 0;
        front = rear = -1;
    }

    boolean IsEmpty() {
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    boolean IsFull() {
        if (size == max) {
            return true;
        }
        else {
            return false;
        }
    }

    void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen Terdepan: " + Q[front].nama + "|" + Q[front].kotaAsal + "|" + Q[front].kotaTujuan + "|" + Q[front].jumlahTiket + "|" + Q[front].harga);
        }
        else {
            System.out.println("Queue Masih Kosong");
        }
    }

    void print() {
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        }
        else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i].nama + "|" + Q[i].kotaAsal + "|" + Q[i].kotaTujuan + "|" + Q[i].jumlahTiket + "|" + Q[i].harga);
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue Berhasil Dikosongkan");
        }
        else {
            System.out.println("Queue Masih Kosong");
        }
    }

    void Enqueue(Penumpang data) {
        if (IsFull()) {
            System.out.println("Queue Sudah Penuh");
        }
        else {
            if (IsEmpty()) {
                front = rear = 0;
            }
            else {
                if (rear == max - 1) {
                    rear = 0;
                }
                else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    Penumpang Dequeue() {
        Penumpang data = new Penumpang("", "", "", 0, 0);
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        }
        else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            }
            else {
                if (front == max - 1) {
                    front = 0;
                }
                else {
                    front++;
                }
            }
        }
        return data;
    }

    void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen Belakang: " + Q[rear].nama + "|" + Q[rear].kotaAsal + "|" + Q[rear].kotaTujuan + "|" + Q[rear].jumlahTiket + "|" + Q[rear].harga);
        }
        else {
            System.out.println("Queue Masih Kosong");
        }
    }
}
