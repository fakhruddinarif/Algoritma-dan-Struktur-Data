package minggu7;

public class PencarianMhs {
    Mahasiswa listMhs[];
    int index;

    PencarianMhs(int jumlah) {
        listMhs = new Mahasiswa[jumlah];
    }

    void tambah(Mahasiswa mhs) {
        if (index < listMhs.length) {
            listMhs[index] = mhs;
            index++;
        }
        else {
            System.out.println("Data Sudah Penuh");
        }
    }
    void tampil() {
        for (Mahasiswa mhs : listMhs) {
            mhs.tampil();
            System.out.println("===============================");
        }
    }

    int FindSeqSearch(String cari) {
        int posisi = -1;
        int hasil = 0;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nama.equalsIgnoreCase(cari)) {
                posisi = j;
                hasil += 1;
            }
            if (hasil > 1) {
                System.out.println("Ditemukan Data Lebih dari 1, terdapat " + (hasil-1) + " data lain");
            }
        }
        return posisi;
    }

    int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].nim) {
                return (mid);
            }
            else if (listMhs[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            }
            else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void TampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " Ditemukan Pada Indeks-" + pos);
        }
        else {
            System.out.println("Data " + x + " Tidak Ditemukan");
        }
    }

    void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t: " + listMhs[pos].nim);
            System.out.println("Nama\t: " + listMhs[pos].nama);
            System.out.println("Umur\t: " + listMhs[pos].umur);
            System.out.println("IPK\t: " + listMhs[pos].ipk);
        }
        else {
            System.out.println("Data " + x + " Tidak Ditemukan");
        }
    }

    public void mergeSort() {
        sort(0, listMhs.length - 1);
    }
    private void merge(int left, int middle, int right) {
        int tempNim[] = new int[listMhs.length];
        String tempNama[] = new String[listMhs.length];
        int tempUmur[] = new int[listMhs.length];
        double tempIpk[] = new double[listMhs.length];

        for (int i = left; i <= right; i++) {
            tempNim[i] = listMhs[i].nim;
            tempNama[i] = listMhs[i].nama;
            tempUmur[i] = listMhs[i].umur;
            tempIpk[i] = listMhs[i].ipk;
        }
        int a = left;
        int b = middle + 1;
        int c = left;

//       Membandingkan Setiap Bagian
        while (a <= middle && b <= right) {
            if (tempNim[a] <= tempNim[b]) {
                listMhs[c].nim = tempNim[a];
                listMhs[c].nama = tempNama[a];
                listMhs[c].umur = tempUmur[a];
                listMhs[c].ipk = tempIpk[a];
                a++;
            }
            else {
                listMhs[c].nim = tempNim[b];
                listMhs[c].nama = tempNama[b];
                listMhs[c].umur = tempUmur[b];
                listMhs[c].ipk = tempIpk[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            listMhs[c + i].nim = tempNim[a + i];
            listMhs[c + i].nama = tempNama[a + i];
            listMhs[c + i].umur = tempUmur[a + i];
            listMhs[c + i].ipk = tempIpk[a + i];
        }
    }

    private void sort(int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(left, middle);
            sort(middle + 1, right);
            merge(left, middle, right);
        }
    }
}
