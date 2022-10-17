import javax.swing.JOptionPane;

public class Latihan08 {
    public static void main(String[] args) {
        String field[] = { "Nama Lengkap", "Alamat", "No Telp" };
        String jmlData = JOptionPane.showInputDialog(null, "Masukkan Jumlah Data : ");
        int n = Integer.parseInt(jmlData);
        String data[][] = new String[n][field.length];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < field.length; j++) {
                data[i][j] = JOptionPane.showInputDialog(null, "Masukan " + field[j] + ":",
                        "Data array ke - " + (i + 1),
                        JOptionPane.QUESTION_MESSAGE);
            }
        }

        String output = "";

        for (int i = 0; i < n; i++) {
            output += "Data ke - " + (i + 1) + "\n";
            for (int j = 0; j < field.length; j++) {
                output += field[j] + ": " + data[i][j] + "\n";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Data",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
