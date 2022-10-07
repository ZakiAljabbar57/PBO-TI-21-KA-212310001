import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        Biodata myBio = new Biodata();

        String nama = JOptionPane.showInputDialog(null, "Masukkan Nama: ", "Nama", JOptionPane.INFORMATION_MESSAGE);
        myBio.setFullName(nama);

        String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat: ", "Alamat",
                JOptionPane.INFORMATION_MESSAGE);
        myBio.setAlamat(alamat);

        String usia = JOptionPane.showInputDialog(null, "Masukkan Usia: ", "Usia", JOptionPane.INFORMATION_MESSAGE);
        int inputUsia = Integer.parseInt(usia);
        myBio.setUsia(inputUsia);

        JOptionPane.showMessageDialog(null, "1. Nama : " + myBio.getFullName() + "\n2. Alamat : " + myBio.getAlamat()
                + "\n3. Usia : " + myBio.getUsia() + " tahun", "Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}