public class Mahasiswa {
    int numberName[] = new int[22];
    int numberNim[] = new int[10];
    int convert[] = new int[32];

    void addName(int ...name) {
        for (int i = 0; i < name.length; i++) {
            numberName[i] = name[i];
        }
    }
    void addNim(int ...nim) {
        for (int i = 0; i < nim.length; i++) {
            numberNim[i] = nim[i];
        }
    }

    void convertData() {
        for (int i = 0; i < numberNim.length; i++) {
            convert[i] = numberNim[i];
        }
        for (int i = numberNim.length; i < numberName.length + numberNim.length; i++) {
            convert[i] = numberName[i - numberNim.length];
        }
    }

    void display() {
        for (int i = 0; i < convert.length; i++) {
            System.out.print(convert[i] + " | ");
        }
        System.out.println();
    }

    void bubbleSort() {
        int temp[] = new int[convert.length];
        for (int i = 0; i < convert.length - 1; i++) {
            for (int j = 1; j < convert.length - i; j++) {
                if (convert[j] < convert[j - 1]) {
                    temp[j] = convert[j];
                    convert[j] = convert[j - 1];
                    convert[j - 1] = temp[j];
                }
            }
        }
    }

    int FindBinarySearch(int search, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (search == convert[mid]) {
                return (mid);
            }
            else if (convert[mid] > search) {
                return FindBinarySearch(search, left, mid - 1);
            }
            else {
                return FindBinarySearch(search, mid + 1, right);
            }
        }
        return -1;
    }

    void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Angka: " + x + " Pertama Kali Ditemukan Pada Index Ke-" + pos);
        }
        else {
            System.out.println("Angka " + x + " Tidak Ditemukan");
        }
    }
}
