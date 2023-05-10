package TugasNomor3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack stk = new Stack();
        Scanner scd = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        char pilih;
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.print("Pilih Operasi Stack (1 - 3): ");
            int inputStack = scd.nextInt();
            if (inputStack == 1) {
                System.out.print("Nama Mata Kuliah: ");
                String nama = scs.nextLine();

                MataKuliah mataKuliah = new MataKuliah(nama);
                stk.push(mataKuliah);
            }
            else if (inputStack == 2) {
                stk.pop();
            }
            else if (inputStack == 3) {
                stk.peek();
            }
            else {
                System.out.println("Inputan Yang Anda Masukkan Tidak Sesuai");
            }

            stk.print();

            System.out.print("Apakah Anda Akan Mengolah Data Ke Stack (y/n)? ");
            pilih = scs.next().charAt(0);
            scs.nextLine();
        } while (pilih == 'y');
    }
}
