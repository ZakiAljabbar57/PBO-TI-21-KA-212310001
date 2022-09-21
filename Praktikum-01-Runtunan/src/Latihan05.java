import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata yang akan diformat (UPPERCASE): ");
        String kata = input.nextLine();

        System.out.println("Kata sebelum diformat: " + kata);
        System.out.println("Kata setelah diformat: " + kata.toUpperCase());

        input.close();
    }
}
