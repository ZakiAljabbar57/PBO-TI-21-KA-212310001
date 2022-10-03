// Zaki Aljabbar - 212310001 - TI-21-KA

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Latihan10Swing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pin = 212310001;
        boolean is_valid = false;
        boolean opsi = false;
        int saldo = 0, setor, tarik;

        String label = "SELAMAT DATANG DI ATM \n";
        label += "Masukkan PIN : ";

        do {
            String validation = JOptionPane.showInputDialog(null, label);
            int conValidation = Integer.parseInt(validation);

            // if (validation == null) {
            // is_valid = true;
            // }

            if (conValidation == pin) {
                is_valid = true;
            } else {
                is_valid = false;
                JOptionPane.showMessageDialog(null, "Maaf Pin Salah", "Password Salah", JOptionPane.ERROR_MESSAGE);
            }
        } while (is_valid == false);

        JOptionPane.showMessageDialog(null, "PIN Benar", "Pin Benar", JOptionPane.INFORMATION_MESSAGE);

        do {
            try {
                String menu_label = "Menu : \n";
                menu_label += "1. Lihat Saldo\n";
                menu_label += "2. Setor Tunai\n";
                menu_label += "3. Tarik Tunai\n";
                menu_label += "4. Keluar\n\n";
                menu_label += "Pilih menu: ";

                String menu = JOptionPane.showInputDialog(null, menu_label);
                int conMenu = Integer.parseInt(menu);

                switch (conMenu) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Saldo Anda : " + saldo, "Saldo",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 2:
                        String inputSetor = JOptionPane.showInputDialog(null, "Masukkan Jumlah Setor Tunai : ",
                                "Setor Tunai", JOptionPane.INFORMATION_MESSAGE);
                        setor = Integer.parseInt(inputSetor);
                        saldo = saldo + setor;
                        JOptionPane.showMessageDialog(null, "Saldo Anda : " + saldo, "Saldo",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 3:
                        tarik = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Jumlah Tarik Tunai : ",
                                "Tarik Tunai", JOptionPane.INFORMATION_MESSAGE));

                        if (tarik > saldo) {
                            JOptionPane.showMessageDialog(null, "Maaf saldo tidak cukup!", "Tarik Tunai",
                                    JOptionPane.ERROR_MESSAGE);
                        } else {
                            saldo = saldo - tarik;
                            JOptionPane.showMessageDialog(null, "Silahkan Ambil Uang Anda!\nSaldo akhir : " + saldo,
                                    "Tarik Tunai",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 4:
                        int choose = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Keluar? ", "Konfirmasi",
                                JOptionPane.YES_NO_OPTION);

                        if (choose == 0) {
                            opsi = true;
                        } else if (choose == 1) {
                            opsi = false;
                        } else {
                            JOptionPane.showMessageDialog(null, "Maaf Command Salah", "Konfirmasi",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Maaf Menu Tidak Tersedia", "ATM",
                                JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Maaf Menu Tidak Tersedia", "ATM",
                        JOptionPane.ERROR_MESSAGE);

                break;
            }
        } while (opsi == false);

        JOptionPane.showMessageDialog(null, "Terima Kasih!");

        // System.out.println("SELAMAT DATANG DI ATM");
        // System.out.println("");
        // do {
        // System.out.print("Masukkan PIN : ");
        // int validation = input.nextInt();

        // if (validation == pin) {
        // is_valid = true;
        // } else {
        // is_valid = false;
        // System.out.println("Maaf, PIN Salah");
        // }
        // } while (is_valid == false);

        // System.out.println("PIN Benar");
        // System.out.println("");

        // do {
        // System.out.println("Menu : ");
        // System.out.println("1. Lihat Saldo");
        // System.out.println("2. Setor Tunai");
        // System.out.println("3. Tarik Tunai");
        // System.out.println("4. Keluar");

        // System.out.print("Pilih Menu : ");
        // int menu = input.nextInt();

        // switch (menu) {
        // case 1:
        // System.out.println("Saldo anda : " + saldo);
        // break;

        // case 2:
        // System.out.print("Jumlah Setor Tunai : ");
        // setor = input.nextInt();
        // saldo = saldo + setor;
        // System.out.println("Saldo akhir : " + saldo);
        // break;

        // case 3:
        // System.out.print("Jumlah Tarik Tunai : ");
        // tarik = input.nextInt();

        // if (tarik > saldo) {
        // System.out.println("Maaf saldo tidak mencukupi");
        // } else {
        // saldo = saldo - tarik;
        // System.out.println("Silahkan ambil uang anda");
        // System.out.println("Saldo akhir : " + saldo);
        // }
        // break;

        // case 4:
        // System.out.print("Ingin keluar? ");
        // String choice = input.next();

        // if (choice.toLowerCase().equals("y")) {
        // opsi = true;
        // } else if (choice.toLowerCase().equals("n")) {
        // opsi = false;
        // } else {
        // System.out.println("Maaf command salah");
        // }
        // break;

        // default:
        // break;
        // }

        // } while (opsi == false);

        input.close();
    }
}
