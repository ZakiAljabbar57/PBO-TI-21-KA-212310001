import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata : ");
        String kata = input.nextLine();
        String originalKata = kata;

        for (int i = 0; i < kata.length(); i++) {

            char c = kata.charAt(i);
            if ((c == 'a') || (c == 'A') || (c == 'i') || (c == 'I') || (c == 'u') || (c == 'U') || (c == 'e')
                    || (c == 'E') || (c == 'o') || (c == 'O')) {
                String depan = kata.substring(0, i);
                String belakang = kata.substring(i + 1);

                kata = depan + "X" + belakang;
            }
        }

        System.out.println(originalKata);
        System.out.println(kata);

        input.close();
    }
}
