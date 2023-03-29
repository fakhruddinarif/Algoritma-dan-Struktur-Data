package MergeSortTest;

import java.util.Scanner;

public class SortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};

        System.out.println("Sorting Dengan Merge Sort");
        MergeSorting mSort = new MergeSorting();
        System.out.println("Data Awal");
        for (int i = 0; i < mSort.dataArr.length; i++) {
            mSort.dataArr[i] = data[i];
        }
        mSort.printArray(mSort.dataArr);
        mSort.mergeSort(mSort.dataArr);
        System.out.println("Setelah Diurutkan");
        mSort.printArray(mSort.dataArr);

//        Seraching With Binary Search
        System.out.println("===========================================");
        System.out.println("Pencarian Data");
        System.out.print("Masukkan Data Yang Dicari: ");
        int inputSearch = sc.nextInt();
        System.out.println("Pencarian Menggunakan Binary Search");
        int posisi = mSort.findBinarySearch(inputSearch, 0, mSort.dataArr.length - 1);
        mSort.tampilData(inputSearch, posisi);

//        Search Nama Mahasiswa (Sequential Search)
    }
}
