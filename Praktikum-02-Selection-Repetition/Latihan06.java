import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opsi;

        do {
            System.out.println("Menu Sarapan : ");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Bubur Ayam");
            System.out.println("3. Soto Ayam");

            System.out.print("Pilih menu : ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Anda memesan Nasi Goreng dengan harga Rp22.000,-");
                    break;

                case 2:
                    System.out.println("Anda memesan Bubur Ayam dengan harga Rp15.000,-");
                    break;

                case 3:
                    System.out.println("Anda memesan Soto Ayam dengan harga Rp25.000,-");
                    break;

                default:
                    System.out.println("Maaf menu yang anda masukkan salah");
                    break;
            }
            System.out.print("Ingin memilih menu kembali? ");
            opsi = input.next();
        } while (opsi.toLowerCase().equals("y"));
        input.close();
    }
}
