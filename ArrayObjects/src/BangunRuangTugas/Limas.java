package BangunRuangTugas;

public class Limas {
    double alas, tinggi;

    Limas(double a, double t) {
        alas = a;
        tinggi = t;
    }
    double hitungLuas() {
        return (alas * alas) + (4 * (alas * tinggi / 2));
    }
    double hitungVolume() {
        return alas * tinggi / 3;
    }
}
