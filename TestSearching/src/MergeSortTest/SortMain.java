package MergeSortTest;

import java.util.Scanner;

public class SortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};

        System.out.println("Sorting Dengan Merge Sort");
        MergeSorting mSort = new MergeSorting();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah Diurutkan");
        mSort.printArray(data);
    }
}
