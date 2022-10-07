import javax.swing.JOptionPane;

public class LatihanFinal {
    public static void main(String[] args) {
        Biodata myBio = new Biodata();
        boolean opsi = false;

        do {
            String label = "1. Input Nama Lengkap\n2. Input Alamat\n3. Input Usia\n4. Biodata\n5. Keluar\n\nMasukkan menu: ";
            String menu = JOptionPane.showInputDialog(null, label, "Menu", JOptionPane.INFORMATION_MESSAGE);

            int conMenu = Integer.parseInt(menu);

            switch (conMenu) {
                case 1:
                    String name = JOptionPane.showInputDialog(null, "Masukkan Nama Lengkap: ", "Nama",
                            JOptionPane.INFORMATION_MESSAGE);
                    if (name == null) {
                        int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin keluar?", "Alert!",
                                JOptionPane.YES_NO_OPTION);
                        if (confirm == 0) {
                            opsi = true;
                            JOptionPane.showMessageDialog(null, "Terima Kasih!", "MyBio",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            continue;
                        }
                    } else if (name.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nama harus diisi!", "Alert!", JOptionPane.ERROR_MESSAGE);
                    } else if (!name.isEmpty()) {
                        myBio.setFullName(name);
                        JOptionPane.showMessageDialog(null, "Input Nama Berhasil!", "Success!",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 2:
                    String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat: ", "Alamat",
                            JOptionPane.INFORMATION_MESSAGE);
                    myBio.setAlamat(alamat);
                    break;

                case 3:
                    String usia = JOptionPane.showInputDialog(null, "Masukkan Usia: ", "Usia",
                            JOptionPane.INFORMATION_MESSAGE);
                    int inputUsia = Integer.parseInt(usia);
                    myBio.setUsia(inputUsia);
                    break;

                case 4:
                    String fullBio = "1. Nama: " + myBio.getFullName() + "\n2. Alamat: " + myBio.getAlamat()
                            + "\n3. Usia: " + myBio.getUsia();

                    if (myBio.getAlamat() == null || myBio.getFullName() == null || myBio.getUsia() == 0) {
                        JOptionPane.showMessageDialog(null, "Mohon lengkapi biodata", "Alert!",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, fullBio, "Biodata", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 5:
                    int choose = JOptionPane.showConfirmDialog(null, "Apakah ingin keluar?", "Keluar",
                            JOptionPane.YES_NO_OPTION);
                    if (choose == 0) {
                        opsi = true;
                        JOptionPane.showMessageDialog(null, "Terima Kasih", "My Biodata",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else if (choose == 1) {
                        opsi = false;
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Maaf menu tidak tersedia", "Alert!",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (opsi == false);
    }
}