import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Latihan10 {
    public static void main(String[] args) {
        String field[] = { "Nama Lengkap", "Alamat", "No Telp" };
        ArrayList<String> data = new ArrayList<String>();

        for (int i = 0; i < field.length; i++) {
            String value = JOptionPane.showInputDialog(null, "Masukan " + field[i] + ":",
                    "Data ke - " + (i + 1) + " | " + field[i],
                    JOptionPane.QUESTION_MESSAGE);
            data.add(value);
        }

        String output = "";
        for (int i = 0; i < field.length; i++) {
            output += field[i] + ": " + data.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Data", JOptionPane.INFORMATION_MESSAGE);
    }
}
