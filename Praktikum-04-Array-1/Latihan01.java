import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Latihan01 {
    public static void main(String[] args) {
        int row = 2;
        int col = 2;

        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> y = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                String value = JOptionPane.showInputDialog(null, "Masukkan Angka : ", "Matrix A [" + i + "][" + j + "]",
                        JOptionPane.QUESTION_MESSAGE);
                x.add(new ArrayList<Integer>());
                x.get(i).add(j, Integer.parseInt(value));
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                String value = JOptionPane.showInputDialog(null, "Masukkan Angka : ", "Matrix B [" + i + "][" + j + "]",
                        JOptionPane.QUESTION_MESSAGE);
                y.add(new ArrayList<Integer>());
                y.get(i).add(j, Integer.parseInt(value));
            }
        }

        String output = "";
        output += "Matrix A : \n";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                output += x.get(i).get(j) + " ";
            }
            output += "\n";
        }
        output += "Matrix B : \n";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                output += y.get(i).get(j) + " ";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output, "Hasil Array", JOptionPane.INFORMATION_MESSAGE);
    }
}
