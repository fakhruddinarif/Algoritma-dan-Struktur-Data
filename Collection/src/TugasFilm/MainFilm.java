package TugasFilm;

import java.util.Scanner;
import java.util.Stack;

public class MainFilm {
    public static void main(String[] args) {
        Scanner scd = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        Stack<Film> films = new Stack<>();
        films.push(new Film(1, "Spider-Man: No Way home", 2021, "Joh Watts"));
        films.push(new Film(2, "Dr.Strange: The Madness of Multiverse", 2022, "Sam Raimi"));
        films.push(new Film(3, "Skyfall", 2012, "Sam Mendes"));
        films.push(new Film(4, "Aquaman", 2018, "James Wan"));
        films.push(new Film(5, "Dark Knight Rises", 2012, "Christopher Nolan"));

        boolean run = true;
        while (run) {
            System.out.println("====================================");
            System.out.println("Data Film Layar Lebar Sepanjang Masa");
            System.out.println("====================================");
            System.out.println("1. Input Judul Film");
            System.out.println("2. Hapus Data Film Teratas");
            System.out.println("3. Cek Judul Film Teratas");
            System.out.println("4. Info Semua Judul Film");
            System.out.println("5. keluar");
            System.out.println("====================================");
            System.out.print("Pilih: ");
            int selectMenu = scd.nextInt();
            switch (selectMenu) {
                case 1:
                    System.out.print("ID Film\t: ");
                    int id = scd.nextInt();
                    System.out.print("Judul Film\t: ");
                    String judul = scs.nextLine();
                    System.out.print("Tahun Tayang\t: ");
                    int tahun = scd.nextInt();
                    System.out.print("Director\t: ");
                    String director = scs.nextLine();
                    films.push(new Film(id, judul, tahun, director));
                    break;
                case 2:
                    System.out.println(films.pop());
                    break;
                case 3:
                    System.out.println(films.peek());
                    break;
                case 4:
                    for (Film film : films) {
                        System.out.println(film.toString());
                    }
                    break;
                case 5:
                    System.out.print("Apakah yakin ingin keluar(y/t)? ");
                    String logout = scs.nextLine();
                    if (logout.toLowerCase().charAt(0) == 'y') run = false;
                    break;
                default:
                    System.out.println("Input Yang Anda Masukkan Tidak Tersedia");
            }
            System.out.println();
        }
    }
}
