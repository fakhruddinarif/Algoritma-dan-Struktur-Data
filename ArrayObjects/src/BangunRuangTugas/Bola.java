package BangunRuangTugas;

import java.math.*;

public class Bola {
    double jariJari;
    Bola(double jj) {
        jariJari = jj;
    }

    double hitungLuasPermukaan() {
        double lp = Math.pow(jariJari, 2) * 4 * 3.14;
        return lp;
    }
    double hitungVolume() {
        double vol = Math.pow(jariJari, 3) * 3.14 * 4 / 3;
        return vol;
    }
}
