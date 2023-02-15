public class exercise_1 {
    public static void main(String[] args) {
        /*
        *  1 Kg = 4500
        *  > 10 = Discount 5%
        * */
        /*
        *  Ani = 4 Kg
        *  Budi = 15 Kg
        *  Bina = 6 Kg
        *  Cita = 11 Kg
        * */
        String customers[] = {"Ani", "Budi", "Bina", "Cita"};
        int laundry[] = {4, 15, 6, 11};
        int totalLaundry[] = new int[laundry.length];
        int total = 0;
        int discount = 0;
        int result = 0;

        for (int i = 0; i < laundry.length; i++) {
            total = 4500 * laundry[i];
            if (laundry[i] > 10) {
                discount = total * 5 / 100;
            }
            total = total - discount;
            totalLaundry[i] = total;
            System.out.printf("Customer %s Membawa %d Kg Pakaian Dengan Biaya : Rp.%,d\n", customers[i], laundry[i], totalLaundry[i]);
            total = 0;
            discount = 0;
            result += totalLaundry[i];
        }
        System.out.println("=================================================================");
        System.out.printf("Pendapatan Smile Laundry Yaitu Rp.%,d", result);
    }
}
