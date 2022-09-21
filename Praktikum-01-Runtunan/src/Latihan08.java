import java.util.Scanner;

public class Latihan08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Lengkap : ");
        String namaLengkap = input.nextLine();
        System.out.print("Kelas : ");
        String kelas = input.nextLine();
        System.out.print("NPM : ");
        int npm = input.nextInt();
        System.out.print("Semester : ");
        int semester = input.nextInt();

        System.out.println("=======================");
        System.out.println("NPM : " + npm);
        System.out.println("Nama : " + namaLengkap);
        System.out.println("Kelas : " + kelas);
        System.out.println("Semester : " + semester);
        input.close();
    }
}
