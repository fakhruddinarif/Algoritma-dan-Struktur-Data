package BangunRuangTugas;

public class Kerucut {
    double jariJari;
    double sisiMiring;

    public Kerucut(double jr, double sisi) {
        jariJari = jr;
        sisiMiring = sisi;
    }

    public double hitungLuas() {
        double lp = 3.14 * jariJari * (jariJari + sisiMiring);
        return lp;
    }

    public double hitungVolume() {
        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(jariJari, 2));
        double vol = (3.14 * jariJari * jariJari * tinggi) / 3;
        return vol;
    }
}
