abstract class Hewan {
    public void makan() {
        System.out.println("Makan.");
    }
    public void tidur() {
        System.out.println("Tidur.");
    }
    public abstract void bersuara();
}

class Anjing extends Hewan {
    public void bersuara() {
        System.out.println("Guk guk!");
    }
}

class Burung extends Hewan {
    public void bersuara() {
        System.out.println("Cicit cicit!");
    }
    public void terbang() {
        System.out.println("Burung terbang.");
    }
}

public class Latihan1 {
    public static void main(String[] args) {
        Anjing a = new Anjing();
        Burung b = new Burung();

        System.out.println("-- Anjing --");
        a.makan();
        a.bersuara();

        System.out.println("-- Burung --");
        b.tidur();
        b.bersuara();
        b.terbang();
    }
}