package minggu7;

public class PencarianMhs {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int index;

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

    int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " Ditemukan Pada Indeks-" + pos);
        }
        else {
            System.out.println("Data " + x + " Tidak Ditemukan");
        }
    }

    void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t: " + x);
            System.out.println("Nama\t: " + listMhs[pos].nama);
            System.out.println("Umur\t: " + listMhs[pos].umur);
            System.out.println("IPK\t: " + listMhs[pos].ipk);
        }
        else {
            System.out.println("Data " + x + " Tidak Ditemukan");
        }
    }
}
