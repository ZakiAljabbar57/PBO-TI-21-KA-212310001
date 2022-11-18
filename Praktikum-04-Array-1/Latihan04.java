import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Latihan04 {
    public static void main(String[] args) {
        String field[] = { "Nama Lengkap", "Alamat", "No Telp" };
        String jmlData = JOptionPane.showInputDialog(null, "Masukkan Jumlah Data : ");
        int n = Integer.parseInt(jmlData);
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < n; j++) {
                String value = JOptionPane.showInputDialog(null, "Masukkan " + field[j] + ":",
                        "Data array ke - " + (i + 1), JOptionPane.QUESTION_MESSAGE);
                data.add(new ArrayList<String>());
                data.get(i).add(j, value);
            }
        }

        String output = "";

        for (int i = 0; i < field.length; i++) {
            output += "Data ke - " + (i + 1) + "\n";
            for (int j = 0; j < n; j++) {
                output += field[j] + ": " + data.get(i).get(j) + "\n";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Data", JOptionPane.INFORMATION_MESSAGE);
    }
}
