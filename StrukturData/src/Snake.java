import java.util.Scanner;
public class Snake {
    int x, y, width, height;

    /*
    * x = Mendatar / Horizontal
    * Y = Vertikal
    * Width = Lebar Area
    * Height = Panjang Area
    * */

    void moveLeft() {
//        X - 1
        x -= 1;
    }
    void moveRight() {
//        X + 1
        x += 1;
    }
    void moveUp() {
//        Y - 1
        y -= 1;
    }
    void moveDown() {
//        Y + 1
        y += 1;
    }
    void printPosition() {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= width; j++) {
                if (i == 0 && j == 0 || i == 0 && j == width || i == height && j == 0 || i == height && j == width) {
                    System.out.print("+");
                }
                else if (i > 0 && j == 0 || j == width) {
                    System.out.print("|");
                }
                else if (j > 0 && i == 0 || i == height) {
                    System.out.print("-");
                }
                else if (i == y && j == x) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void detectColision(int x, int y) {

    }

    public static void main(String[] args) {
        Scanner arif = new Scanner(System.in);
        boolean play = true;

        System.out.print("Panjang Area Permainan(Dimulai dari 1): ");
        int height = arif.nextInt();
        System.out.print("Lebar Area Permainan(Dimulai dari 1): ");
        int width = arif.nextInt();

        System.out.print("X Awal Permainan(Dimulai dari 0): ");
        int x = arif.nextInt();
        System.out.print("Y Awal Permainan(Dimulai dari 0): ");
        int y = arif.nextInt();

        Snake snake = new Snake();
        snake.height = height + 1;
        snake.width = width + 1;
        snake.x = x + 1;
        snake.y = y + 1;

        if (snake.x >= 0 && snake.y >= 0 && snake.x <= snake.width && snake.y <= snake.height) {
            snake.printPosition();
        }
        else {

        }

        while(play) {
            System.out.println();

            System.out.println("1. Move Up");
            System.out.println("2. Move Down");
            System.out.println("3. Move Right");
            System.out.println("4. Move Left");
            System.out.print("Pilih Mode Pindah Posisi: ");
            int posisi = arif.nextInt();

            if (posisi == 1) {
                snake.moveUp();
            }
            else if (posisi == 2) {
                snake.moveDown();
            }
            else if (posisi == 3) {
                snake.moveRight();
            }
            else if (posisi == 4) {
                snake.moveLeft();
            }
            else {
                System.out.println("Inputan Mode Anda Tidak Sesuai");
            }

            if (snake.x > 0 && snake.y > 0 && snake.x < snake.width && snake.y < snake.height) {
                snake.printPosition();
            }
            else {
                System.out.println("Game Over");
                break;
            }
        }
    }
}
