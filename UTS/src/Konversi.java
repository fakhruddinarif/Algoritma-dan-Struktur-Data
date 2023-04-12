public class Konversi {
    Mahasiswa listMhs[] = new Mahasiswa[1];
    int idx;

    void add(Mahasiswa mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        }
        else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].convert > listMhs[j - 1].convert) {
                    Mahasiswa temp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = temp;
                }
            }
        }
    }
    /*int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].convert) {
                return (mid);
            }
            else if (listMhs[mid].convert > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            }
            else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }*/
}
