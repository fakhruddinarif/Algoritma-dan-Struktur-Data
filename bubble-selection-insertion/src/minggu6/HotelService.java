package minggu6;

public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int index;

    void tambah(Hotel h) {
        if (index < rooms.length) {
            rooms[index] = h;
            index++;
        }
        else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampilAll() {
        for (Hotel hotel : rooms) {
            System.out.println("==============================================");
            System.out.println("Nama Hotel   : " + hotel.nama);
            System.out.println("Kota Hotel   : " + hotel.kota);
            System.out.println("Harga Hotel  : " + hotel.harga);
            System.out.println("Rating Hotel : " + hotel.bintang);
        }
    }

    void bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int indexMax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[indexMax].bintang) {
                    indexMax = j;
                }
            }
            Hotel temp = rooms[indexMax];
            rooms[indexMax] = rooms[i];
            rooms[i] = temp;
        }
    }
}
