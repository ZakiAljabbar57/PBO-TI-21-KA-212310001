import javax.swing.JOptionPane;

public class Latihan05 {
    public static void main(String[] args) {
        String field[] = { "Nama Lengkap", "Alamat", "No Telp" };
        String data[] = new String[field.length];

        for (int i = 0; i < field.length; i++) {
            data[i] = JOptionPane.showInputDialog(null, "Masukan " + field[i] + ":", "Data array ke - " + i,
                    JOptionPane.QUESTION_MESSAGE);
        }

        String output = "";
        for (int i = 0; i < field.length; i++) {
            output += field[i] + ": " + data[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Data", JOptionPane.INFORMATION_MESSAGE);
    }
}
