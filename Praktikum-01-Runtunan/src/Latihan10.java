import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

public class Latihan10 {
    public static void main(String[] args) {
        Students member = new Students();
        int harga = 6300;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama member : ");
        String fullName = input.nextLine();

        System.out.println("================================================");
        System.out.println("                TOKO SERBAGUNA IBIK             ");
        System.out.println("================================================");

        System.out.print("Masukkan jumlah produk yang dibeli : ");
        int qty = input.nextInt();

        int total = harga * qty;

        double kelipatan = qty / 3;
        double diskon = Math.floor(kelipatan) * 0.05;
        double harga_diskon = total - (total * diskon);

        LocalDateTime thisDateObj = LocalDateTime.now();
        DateTimeFormatter thisFormatObj = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");
        String formattedDate = thisDateObj.format(thisFormatObj);

        System.out.println(formattedDate);
        System.out.println("ITEM            QTY         HARGA          TOTAL");
        System.out.println("================================================");
        System.out.println("ROTI ENAK        " + qty + "          " + harga + "           " + total);
        System.out.println("------------------------------------------------");
        System.out.println("Diskon: " + diskon * (100) + "%");
        System.out.println("Sub Total: " + harga_diskon);
        System.out.println("Member Name: " + member.getFullName(fullName));

        input.close();
    }
}
