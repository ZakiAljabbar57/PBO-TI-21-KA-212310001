import javax.swing.JOptionPane;

public class Latihan03 {
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

        JOptionPane.showMessageDialog(null, output, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}