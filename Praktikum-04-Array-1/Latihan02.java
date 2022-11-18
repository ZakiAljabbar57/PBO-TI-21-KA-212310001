import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        int row1 = 2;
        int col1 = 2;

        int row2 = 2;
        int col2 = 2;

        int jmlh = 0;

        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> y = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> hasil = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                String value = JOptionPane.showInputDialog(null, "Masukkan Angka : ", "Matrix A [" + i + "][" + j + "]",
                        JOptionPane.QUESTION_MESSAGE);
                x.add(new ArrayList<Integer>());
                x.get(i).add(j, Integer.parseInt(value));
            }
        }

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                String value = JOptionPane.showInputDialog(null, "Masukkan Angka : ", "Matrix B [" + i + "][" + j + "]",
                        JOptionPane.QUESTION_MESSAGE);
                y.add(new ArrayList<Integer>());
                y.get(i).add(j, Integer.parseInt(value));
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    jmlh = jmlh + x.get(i).get(k) * y.get(k).get(j);
                }
                hasil.add(new ArrayList<Integer>());
                hasil.get(i).add(j, jmlh);
                jmlh = 0;
            }
        }

        String output = "";
        output += "Matrix A : \n";
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                output += x.get(i).get(j) + " ";
            }
            output += "\n";
        }
        output += "Matrix B : \n";
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                output += y.get(i).get(j) + " ";
            }
            output += "\n";
        }

        output += "\nHasil Perkalian Matrix A * B\n";
        output += "Matrix C : \n";
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                output += hasil.get(i).get(j) + " ";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Hasil Array",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
