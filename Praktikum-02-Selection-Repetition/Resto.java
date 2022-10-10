import javax.swing.JOptionPane;

public class Resto {
    private long harga;

    public void chooseMenu(int menu) {
        switch (menu) {
            case 1:
                JOptionPane.showMessageDialog(null, "Anda memesan Nasi Goreng dengan harga " + getPrices(menu) + ",-",
                        "Menu", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Anda memesan Bubur Ayam dengan harga " + getPrices(menu) + ",-",
                        "Menu", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Anda memesan Soto Ayam dengan harga " + getPrices(menu) + ",-",
                        "Menu", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Maaf menu yang anda masukkan salah!", "Alert!",
                        JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    private long getPrices(int menu) {
        Resto obj = new Resto();
        if (menu == 1) {
            obj.harga = 22000;
        } else if (menu == 2) {
            obj.harga = 15000;
        } else if (menu == 3) {
            obj.harga = 25000;
        }
        return obj.harga;
    }
}
