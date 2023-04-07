package Pratikum1;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        Scanner scd = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        char pilih;
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. GetMin");
            System.out.print("Pilih Operasi Stack (1 - 5): ");
            int inputStack = scd.nextInt();
            if (inputStack == 1) {
                System.out.print("Jenis: ");
                String jenis = scs.nextLine();
                System.out.print("Warna: ");
                String warna = scs.nextLine();
                System.out.print("Merk: ");
                String merk = scs.nextLine();
                System.out.print("Ukuran: ");
                String ukuran = scs.nextLine();
                System.out.print("Harga: ");
                double harga = scd.nextDouble();

                Pakaian pakaian = new Pakaian(jenis, warna, merk, ukuran, harga);
                stk.push(pakaian);
            }
            else if (inputStack == 2) {
                stk.pop();
            }
            else if (inputStack == 3) {
                stk.peek();
            }
            else if (inputStack == 4) {
                stk.print();
            }
            else if (inputStack == 5) {
                stk.getMin();
            }
            else {
                System.out.println("Inputan Yang Anda Masukkan Tidak Sesuai");
            }
            System.out.print("Apakah Anda Akan Mengolah Data Ke Stack (y/n)? ");
            pilih = scs.next().charAt(0);
            scs.nextLine();
        } while (pilih == 'y');
    }
}