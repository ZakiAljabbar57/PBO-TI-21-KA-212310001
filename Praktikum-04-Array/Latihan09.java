import javax.swing.JOptionPane;
import java.util.*;

public class Latihan09 {
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<Integer>();
        int jml_array = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Masukkan Jumlah Array: ", "Input", JOptionPane.QUESTION_MESSAGE));

        for (int i = 0; i < jml_array; i++) {
            String value = JOptionPane.showInputDialog(null, "Masukkan angka: ", "Data array ke - " + i,
                    JOptionPane.INFORMATION_MESSAGE);
            nilai.add(Integer.parseInt(value));
        }

        String output = "";
        for (int i = 0; i < jml_array; i++) {
            output += "x[" + i + "] = " + nilai.get(i) + "\n";
        }

        output += "Nilai terbesar = " + Collections.max(nilai) + "\n";
        output += "Nilai terkecil = " + Collections.min(nilai);

        JOptionPane.showMessageDialog(null, output, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}