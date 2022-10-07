public class Biodata {
    private String fullName;
    private int usia;
    private String alamat;

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getUsia() {
        return this.usia;
    }

}