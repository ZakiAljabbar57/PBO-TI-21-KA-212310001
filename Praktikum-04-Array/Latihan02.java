import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[5];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Masukkan umur ke - " + i + ": ");
            ages[i] = input.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Ages " + i + "=" + ages[i]);
        }
        input.close();
    }
}
