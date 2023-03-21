package minggu5;

public class Majority {
    int findMajority(int arr[], int n) {
        if (n == 1) {
            return arr[0];
        }
        int mid = n / 2;
        int leftArr[] = copy(arr, 0, mid);
        int rightArr[] = copy(arr, mid, n);
        int left = findMajority(leftArr, mid);
        int right = findMajority(rightArr, n - mid);
        if (left == right) {
            return left;
        }
        int leftCount = count(arr, n, left);
        int rightCount = count(arr, n, right);
        if (leftCount > rightCount) {
            return left;
        }
        else {
            return right;
        }
    }

    int[] copy(int arr[], int from, int to) {
        int array[] = new int[to - from];
        for (int i = from; i < to; i++) {
            array[i - from] = arr[i];
        }
        return array;
    }

    int count(int arr[], int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
}
