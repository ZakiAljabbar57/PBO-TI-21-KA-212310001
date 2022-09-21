import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        int harga = 6300;

        Scanner input = new Scanner(System.in);

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

        input.close();

    }
}
