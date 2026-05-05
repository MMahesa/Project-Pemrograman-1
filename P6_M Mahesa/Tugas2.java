public class Tugas2 {

    private final String nama;
    private final double harga;
    private int stok;

    private static int jumlahProduk = 0;

    public Tugas2(String nama, double harga, int stok) {
        this.nama  = nama;
        this.harga = harga;
        this.stok  = stok;
        jumlahProduk++;
    }

    public String getNama()  { return nama; }
    public double getHarga() { return harga; }
    public int getStok()     { return stok; }

    public static int getJumlahProduk() {
        return jumlahProduk;
    }
    public String getKategoriHarga() {
        if (harga < 50000)  return "Murah";
        if (harga < 200000) return "Sedang";
        return "Mahal";
    }
    public void beli(int jumlah) {
        if (jumlah > stok) {
            System.out.println("Stok " + nama + " tidak cukup!");
            return;
        }
        stok -= jumlah;
        System.out.println("Beli " + jumlah + "x " + nama + " berhasil.");
    }

    public static void main(String[] args) {
        Tugas2 p1 = new Tugas2("Pensil", 3000, 50);
        Tugas2 p2 = new Tugas2("Buku Tulis", 15000, 30);
        Tugas2 p3 = new Tugas2("Laptop", 8500000, 5);

        Tugas2[] daftar = {p1, p2, p3};

        for (Tugas2 p : daftar) {
            System.out.println("Produk  : " + p.getNama());
            System.out.println("Harga   : Rp" + p.getHarga());
            System.out.println("Stok    : " + p.getStok());
            System.out.println("Kategori: " + p.getKategoriHarga());
            System.out.println();
        }


        System.out.println("Total produk terdaftar: " + Tugas2.getJumlahProduk());

        System.out.println();
        p2.beli(10);
        p2.beli(50); 
        System.out.println("Sisa stok buku: " + p2.getStok());
    }
}