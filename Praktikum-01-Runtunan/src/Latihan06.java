import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia : ");
        String usia = input.nextLine();
        System.out.print("Masukkan nama depan : ");
        String firstName = input.nextLine();
        System.out.print("Masukkan nama belakang : ");
        String lastName = input.nextLine();
        System.out.print("Masukkan npm : ");
        String npm = input.nextLine();

        String kalimat = usia.concat(firstName).concat(lastName).concat(npm);

        System.out.println("======================");
        System.out.println("Hasil concatenation : ");
        System.out.println(kalimat);

        input.close();
    }
}
