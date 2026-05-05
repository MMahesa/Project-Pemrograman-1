public class Latihan2 {

    private String nama;
    private double sisi1;
    private double sisi2;

    public void setNama(String nama) { this.nama = nama; }
    public void setSisi(double sisi1) { this.sisi1 = sisi1; }
    public void setSisi(double sisi1, double sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    //hitung luas persegi (1 param) atau persegi panjang (2 param)
    public double getLuas() {
        return sisi1 * sisi2;        // persegi
    }

    public double getLuas(double p, double l) {
        return p * l;                // persegi panjang
    }

    public void print() {
        System.out.println("Bangun : " + nama);
        System.out.println("Luas   : " + getLuas());
    }

    public void print(double p, double l) {
        System.out.println("Bangun : " + nama);
        System.out.println("Luas   : " + getLuas(p, l));
    }

    public static void main(String[] args) {
        Latihan2 bg = new Latihan2();

        // persegi
        bg.setNama("Persegi");
        bg.setSisi(5.0);
        bg.print();

        System.out.println();

        bg.setNama("Persegi Panjang");
        bg.print(8.0, 4.0);
    }
}