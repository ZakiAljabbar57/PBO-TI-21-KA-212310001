import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        Biodata myBio = new Biodata();

        boolean is_validName = false;
        boolean is_validAge = false;
        boolean is_validAddress = false;
        boolean is_program = false;

        mainloop: do {
            do {
                String nama = JOptionPane.showInputDialog(null, "Masukkan Nama: ", "Nama",
                        JOptionPane.INFORMATION_MESSAGE);
                if (nama == null) {
                    int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?", "Confirm",
                            JOptionPane.YES_NO_OPTION);
                    if (confirm == 0) {
                        JOptionPane.showMessageDialog(null, "Terima Kasih!", "MyBio",
                                JOptionPane.INFORMATION_MESSAGE);
                        is_validName = true;
                        break mainloop;
                    } else if (confirm == 1) {
                        is_validName = false;
                    }
                } else if (nama.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Field Full Name tidak boleh kosong", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                } else if (!nama.isEmpty()) {
                    myBio.setFullName(nama);
                    JOptionPane.showMessageDialog(null, "Sukses menambahkan nama!", "Success!",
                            JOptionPane.INFORMATION_MESSAGE);
                    is_validName = true;
                }
            } while (is_validName == false);

            do {
                try {
                    String usia = JOptionPane.showInputDialog(null, "Masukkan Usia: ", "Usia",
                            JOptionPane.INFORMATION_MESSAGE);

                    if (usia == null) {
                        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?", "Confirm",
                                JOptionPane.YES_NO_OPTION);
                        if (confirm == 0) {
                            JOptionPane.showMessageDialog(null, "Terima Kasih!", "MyBio",
                                    JOptionPane.INFORMATION_MESSAGE);
                            is_validAge = true;
                            break mainloop;
                        } else if (confirm == 1) {
                            is_validAge = false;
                        }
                    } else if (usia.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Field usia tidak boleh kosong!",
                                "Alert!",
                                JOptionPane.ERROR_MESSAGE);
                        continue;
                    } else if (!usia.isEmpty()) {
                        int inputUsia = Integer.parseInt(usia);
                        myBio.setUsia(inputUsia);
                        JOptionPane.showMessageDialog(null, "Sukses menambahkan usia!", "Success!",
                                JOptionPane.INFORMATION_MESSAGE);
                        is_validAge = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Isian harus angka!", "Error!",
                            JOptionPane.ERROR_MESSAGE);
                }

            } while (is_validAge == false);

            do {
                String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat: ", "Alamat",
                        JOptionPane.INFORMATION_MESSAGE);

                if (alamat == null) {
                    int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?", "Confirm",
                            JOptionPane.YES_NO_OPTION);
                    if (confirm == 0) {
                        JOptionPane.showMessageDialog(null, "Terima Kasih!", "MyBio",
                                JOptionPane.INFORMATION_MESSAGE);
                        is_validAddress = true;
                        break mainloop;
                    } else {
                        is_validAddress = false;
                    }
                } else if (alamat.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Field Full Alamat tidak boleh kosong", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                } else if (!alamat.isEmpty()) {
                    if (alamat.length() < 10) {
                        JOptionPane.showMessageDialog(null, "Masukkan alamat min. 10 Karakter!", "Alert!",
                                JOptionPane.ERROR_MESSAGE);
                        continue;
                    } else if (alamat.length() > 10) {
                        myBio.setAlamat(alamat);
                        JOptionPane.showMessageDialog(null, "Sukses menambahkan alamat!", "Success!",
                                JOptionPane.INFORMATION_MESSAGE);
                        is_validAddress = true;
                    }
                }
            } while (is_validAddress == false);

            String result = "1. Nama : " + myBio.getFullName() + "\n2. Usia : " + myBio.getUsia() + "\n3. Alamat : "
                    + myBio.getAlamat();
            JOptionPane.showMessageDialog(null, result, "MyBio", JOptionPane.INFORMATION_MESSAGE);

            int back = JOptionPane.showConfirmDialog(null, "Apakah anda ingin kembali?", "Confirm",
                    JOptionPane.YES_NO_OPTION);
            if (back == 0) {
                is_program = false;
            } else if (back == 1) {
                is_program = true;
                JOptionPane.showMessageDialog(null, "Terima Kasih!", "MyBio", JOptionPane.INFORMATION_MESSAGE);
            }
        } while (!is_program);
    }
}