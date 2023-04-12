import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        mhs.addName(13, 21, 8, 1, 13, 13, 1, 4, 6, 1, 11, 8, 18, 21, 4, 4, 9, 14, 1, 18, 9, 6);
        mhs.addNim(2, 2, 4, 1, 7, 2, 0, 0, 3, 0);
        mhs.convertData();
        System.out.println("Data Keseluruhan: ");
        mhs.display();
        mhs.bubbleSort();
        System.out.println("Data Setelah Di Sorting: ");
        mhs.display();

        System.out.println("===============================================");
        System.out.println("Pencarian Angka");
        System.out.print("Masukkan Angka Yang Ingin Dicari: ");
        int inputSearch = sc.nextInt();
        int position = mhs.FindBinarySearch(inputSearch, 0, mhs.convert.length - 1);
        mhs.showPosition(inputSearch, position);
    }
}