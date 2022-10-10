import javax.swing.JOptionPane;

public class Latihan07Swing {
    public static void main(String[] args) {
        Resto restObj = new Resto();

        boolean back = false;
        String label = "Menu Sarapan\n1. Nasi Goreng\n2. Bubur Ayam\n3. Soto Ayam\n\nPilih Menu: ";

        do {
            String menu = JOptionPane.showInputDialog(null, label, "Menu", JOptionPane.INFORMATION_MESSAGE);
            if (menu == null) {
                int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?", "Confirm",
                        JOptionPane.YES_NO_OPTION);
                if (confirm == 0) {
                    JOptionPane.showMessageDialog(null, "Terima Kasih!", "MyResto", JOptionPane.INFORMATION_MESSAGE);
                    break;
                } else {
                    continue;
                }
            } else if (menu.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Mohon masukkan menu!", "Alert!", JOptionPane.ERROR_MESSAGE);
                back = true;
            } else if (!menu.isEmpty()) {
                int conMenu = Integer.parseInt(menu);
                restObj.chooseMenu(conMenu);
            }

            int opsi = JOptionPane.showConfirmDialog(null, "Apakah anda ingin kembali?", "Return",
                    JOptionPane.YES_NO_OPTION);
            if (opsi == 0) {
                back = true;
            } else if (opsi == 1) {
                back = false;
                JOptionPane.showMessageDialog(null, "Terima Kasih!", "MyResto", JOptionPane.INFORMATION_MESSAGE);
            }
        } while (back == true);
    }
}
