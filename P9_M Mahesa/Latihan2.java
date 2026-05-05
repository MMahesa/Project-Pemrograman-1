interface Kendaraan {
    String jenis = "Kendaraan Darat"; 
    public void jalan();
    public void berhenti();
    public String getMerk();
}

class Mobil implements Kendaraan {
    private final String merk;
    public Mobil(String merk) { this.merk = merk; }

    @Override
    public void jalan()     { System.out.println(merk + " melaju."); }
    @Override
    public void berhenti()  { System.out.println(merk + " berhenti."); }
    @Override
    public String getMerk() { return merk; }
}

class Motor implements Kendaraan {
    private String merk;
    public Motor(String merk) { this.merk = merk; }

    @Override
    public void jalan()     { System.out.println(merk + " ngebut!"); }
    @Override
    public void berhenti()  { System.out.println(merk + " rem mendadak."); }
    @Override
    public String getMerk() { return merk; }
}

public class Latihan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil("Toyota");
        Motor mo = new Motor("Honda");

        System.out.println("Jenis: " + Kendaraan.jenis);
        System.out.println();

        m.jalan();
        m.berhenti();

        System.out.println();

        mo.jalan();
        mo.berhenti();
    }
}