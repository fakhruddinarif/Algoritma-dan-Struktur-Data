public class Mahasiswa {
    String nim;
    String nama;
    String noTelp;

    Mahasiswa() {

    }
    Mahasiswa(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }
    @Override
    public String toString() {
        return "Mahasiswa{" + "nim = " + nim + ", nama = " + nama + ", noTelp = " + noTelp + "}";
    }
}
