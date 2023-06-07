import java.util.*;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    void hapus(int index) {
        mahasiswas.remove(index);
    }
    void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }
    void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        List<String> nimList = new ArrayList<>();
        for (Mahasiswa mhs : mahasiswas) {
            nimList.add(mhs.nim);
        }
        return Collections.binarySearch(nimList, nim);
    }

    public void sortAscending() {
        mahasiswas.sort(Comparator.comparing(mhs -> mhs.nim));
    }

    public void sortDescending() {
        mahasiswas.sort((mhs1, mhs2) -> mhs2.nim.compareTo(mhs1.nim));
    }


    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m0 = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        lm.tambah(m0, m1, m2);
        lm.tampil();
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println();
        lm.tampil();
        System.out.println("\nAscending");
        lm.sortAscending();
        lm.tampil();
        System.out.println("\nDescending");
        lm.sortDescending();
        lm.tampil();
    }
}
