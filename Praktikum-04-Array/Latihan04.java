import javax.swing.JOptionPane;
import java.util.*;

public class Latihan04 {
    public static void main(String[] args) {
        int jml_array = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Masukkan Jumlah Array: ", "Input", JOptionPane.QUESTION_MESSAGE));
        int nilai[] = new int[jml_array];

        for (int i = 0; i < jml_array; i++) {
            String value = JOptionPane.showInputDialog(null, "Masukkan angka: ", "Data array ke - " + i,
                    JOptionPane.INFORMATION_MESSAGE);
            nilai[i] = Integer.parseInt(value);
        }

        String output = "";
        for (int i = 0; i < jml_array; i++) {
            output += "x[" + i + "] = " + nilai[i] + "\n";
        }

        output += "Nilai terbesar = " + Arrays.stream(nilai).max().getAsInt() + "\n";
        output += "Nilai terkecil = " + Arrays.stream(nilai).min().getAsInt();

        JOptionPane.showMessageDialog(null, output, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}