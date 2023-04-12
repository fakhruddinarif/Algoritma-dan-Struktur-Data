public class Mahasiswa {
    String nama, nim;
    String convert;

    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        convert = this.nim + this.nama;
    }
}
