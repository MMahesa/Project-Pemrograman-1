public class Latihan1 {

    private String nama;
    private int nim;
    private double nilai;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    public double getNilai() {
        return nilai;
    }

    public String getStatus() {
        if (nilai >= 60) return "Lulus";
        else return "Tidak Lulus";
    }

    public static void main(String[] args) {
        Latihan1 mhs = new Latihan1();

        mhs.setNama("Budi");
        mhs.setNim(210001);
        mhs.setNilai(75.5);

        System.out.println("Nama  : " + mhs.getNama());
        System.out.println("NIM   : " + mhs.getNim());
        System.out.println("Nilai : " + mhs.getNilai());
        System.out.println("Status: " + mhs.getStatus());
    }
}