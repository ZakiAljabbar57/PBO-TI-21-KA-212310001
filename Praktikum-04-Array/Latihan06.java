import javax.swing.JOptionPane;

public class Latihan06 {
    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        int a[][] = new int[row][col];
        int b[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                String value = JOptionPane.showInputDialog(null, "Masukkan Angka : ", "Matrix A [" + i + "][" + j + "]",
                        JOptionPane.QUESTION_MESSAGE);
                a[i][j] = Integer.parseInt(value);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                String value = JOptionPane.showInputDialog(null, "Masukkan Angka : ", "Matrix B [" + i + "][" + j + "]",
                        JOptionPane.QUESTION_MESSAGE);
                b[i][j] = Integer.parseInt(value);
            }
        }

        String output = "";
        output += "Matrix A : \n";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                output += a[i][j] + " ";
            }
            output += "\n";
        }

        output += "Matrix B : \n";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                output += b[i][j] + " ";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Hasil Array",
                JOptionPane.INFORMATION_MESSAGE);
    }
}