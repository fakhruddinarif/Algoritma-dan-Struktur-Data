package ArraySegitiga;
import java.math.*;

public class Segitiga {
    public int alas;
    public int tinggi;

    Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    double hitungLuas() {
        return alas  * tinggi / 2;
    }

    double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return sisiMiring + alas + tinggi;
    }
}
