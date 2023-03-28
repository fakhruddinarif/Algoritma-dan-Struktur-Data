package minggu6;

public class MainMahasiswa {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa mhs1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa mhs2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa mhs3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa mhs4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa mhs5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(mhs1);
        list.tambah(mhs2);
        list.tambah(mhs3);
        list.tambah(mhs4);
        list.tambah(mhs5);

        System.out.println("Data Mahasiswa Sebelum Starting: ");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting Desc Berdasarkan IPK");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting Asc Berdasarkan IPK");
        list.selectionSort();
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting Asc Berdasarkan IPK");
        list.insertionSort();
        list.tampil();
    }
}
