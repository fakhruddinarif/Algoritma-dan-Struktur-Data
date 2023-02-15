public class array {
    public static void main(String[] args) {
        String store[] = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"}; // Baris
        String flower[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"}; // Kolom
        int stock[][] = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        int price[] = {75000, 50000, 60000, 10000};
        int minStock[] = {1, 2, 0, 5};
        /*
        * Harga:
        * Aglonema = 75000
        * Keladi = 50000
        * Alocasia = 60000
        * Mawar = 10000
        * */

//        4.A Jumlah Stock Berdasarkan Jenis Bunga Diseluruh Cabang
        int result = 0;
        for (int i = 0; i < stock[0].length; i++) {
            for (int j = 0; j < stock.length; j++) {
                result += stock[j][i];
            }
            System.out.printf("Jumlah Stock Bunga %s : ", flower[i]);
            System.out.println(result);
            result = 0;
        }
        System.out.println();
//        4.B RoyalGarden1 = Aglonema -1, Keladi - 2, Mawar - 5
        int total = 0;
        for (int i = 0; i < stock[0].length; i++) {
            stock[0][i] = stock[0][i] - minStock[i];
            result = stock[0][i] * price[i];
            System.out.printf("%s -> %d Bunga Dengan Total Harga Rp.%,d\n", flower[i], stock[0][i], result);
            total += result;
            result = 0;
        }
        System.out.printf("Total Pendapatan Dari RoyalGarden1 Adalah: Rp.%,d", total);
    }
}
