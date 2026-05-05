
public class Tugas1 {

    private double tinggi;
    private double alas;

    public void setTinggi(double tinggi) { this.tinggi = tinggi; }
    public void setAlas(double alas)     { this.alas = alas; }

    public double getTinggi() { return tinggi; }
    public double getAlas()   { return alas; }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling(double miringKiri, double miringKanan) {
        return alas + miringKiri + miringKanan;
    }

    public static void main(String[] args) {
        Tugas1[] s = new Tugas1[3];

        s[0] = new Tugas1();
        s[1] = new Tugas1();
        s[2] = new Tugas1();

        s[0].setAlas(6);   s[0].setTinggi(4);
        s[1].setAlas(10);  s[1].setTinggi(7.5);
        s[2].setAlas(3.5); s[2].setTinggi(9);

        for (int i = 0; i < s.length; i++) {
            System.out.println("=== Segitiga ke-" + (i + 1) + " ===");
            System.out.println("Alas   : " + s[i].getAlas());
            System.out.println("Tinggi : " + s[i].getTinggi());
            System.out.println("Luas   : " + s[i].getLuas());
            System.out.println();
        }
    }
}