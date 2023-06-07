package Tugas;

public class Queue {
    int max, size, front, rear;
    Mahasiswa antrian[];

    Queue(int n) {
        max = n;
        Create();
    }

    void Create() {
        antrian = new Mahasiswa[max];
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
            System.out.println("Elemen Terdepan: " + antrian[front].nim + " | " + antrian[front].nama + " | " + antrian[front].absen + " | " + antrian[front].ipk);
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
                System.out.print(antrian[i].nim + " | " + antrian[i].nama + " | " + antrian[i].absen + " | " + antrian[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i] + " ");
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

    void Enqueue(Mahasiswa data) {
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
            antrian[rear] = data;
            size++;
        }
    }

    Mahasiswa Dequeue() {
        Mahasiswa data = new Mahasiswa("", "",0, 0);
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        }
        else {
            data = antrian[front];
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
            System.out.println("Elemen Belakang: " + antrian[rear].nim + " | " + antrian[rear].nama + " | " + antrian[rear].absen + " | " + antrian[rear].ipk);
        }
        else {
            System.out.println("Queue Masih Kosong");
        }
    }
    void peekPosition(String nim) {
        int posisi = -1;
        for (int i = 0; i < antrian.length; i++) {
            if (nim.equalsIgnoreCase(antrian[i].nim)) {
                posisi = i;
                break;
            }
        }
        if (posisi < 0) {
            System.out.println("Data Tidak Ditemukan");
        }
        else {
            System.out.println("Mahasiswa Dengan NIM " + nim + " Berada Pada Antrian Posisi Ke-" + (posisi + 1));
        }
    }
    void printMahasiswa(int posisi) {
        for (int i = 0; i < antrian.length; i++) {
            if (posisi < antrian.length && posisi >= 0) {
                if (posisi == i) {
                    System.out.println("NIM     : " + antrian[i].nim);
                    System.out.println("Nama    : " + antrian[i].nama);
                    System.out.println("Absen   : " + antrian[i].absen);
                    System.out.println("IPK     : " + antrian[i].ipk);
                }
            }
            else {
                System.out.println("Posisi Yang Anda Masukkan Tidak Sesuai");
                break;
            }
        }
    }
}
