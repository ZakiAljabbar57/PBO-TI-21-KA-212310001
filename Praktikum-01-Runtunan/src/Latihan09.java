import java.util.Scanner;

class Students {
    int npm;
    String fullName, className;
    int semester;
    float gpa;

    int getNPM(int npm) {
        return npm;
    }

    String getFullName(String fullName) {
        return fullName;
    }

    String getclassName(String className) {
        return className;
    }

    int getSemester(int semester) {
        return semester;
    }

    float getGPA(float gpa) {
        return gpa;
    }
}

public class Latihan09 {
    public static void main(String[] args) {
        Students myBio = new Students();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String name = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = input.nextLine();
        System.out.print("Masukkan NPM : ");
        int npm = input.nextInt();
        System.out.print("Masukkan IPK : ");
        float gpa = input.nextFloat();

        System.out.println("==============================");

        System.out.println("Nama : " + myBio.getFullName(name));
        System.out.println("Kelas : " + myBio.getclassName(kelas));
        System.out.println("NPM : " + myBio.getNPM(npm));
        System.out.println("IPK : " + myBio.getGPA(gpa));

        input.close();

    }
}
