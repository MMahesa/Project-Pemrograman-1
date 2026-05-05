// Adaptasi contoh MakhlukHidup dari modul (hal. 6-7)
abstract class MakhlukHidup {
    public void bernafas() {
        System.out.println("Bernafas.");
    }
    public void makan() {
        System.out.println("Makan.");
    }
    public abstract void bergerak();
}

class Manusia extends MakhlukHidup {
    public void bergerak() {
        System.out.println("Berjalan dengan 2 kaki.");
    }
}

class Kucing extends MakhlukHidup {
    public void bergerak() {
        System.out.println("Berjalan dengan 4 kaki.");
    }
}

class Ikan extends MakhlukHidup {
    public void bernafas() {
        System.out.println("Bernafas pakai insang.");
    }
    public void bergerak() {
        System.out.println("Berenang pakai sirip.");
    }
}

public class Tugas1 {
    public static void main(String[] args) {
        MakhlukHidup[] makhluk = { new Manusia(), new Kucing(), new Ikan() };
        String[] nama = { "Manusia", "Kucing", "Ikan" };

        for (int i = 0; i < makhluk.length; i++) {
            System.out.println("-- " + nama[i] + " --");
            makhluk[i].bernafas();
            makhluk[i].makan();
            makhluk[i].bergerak();
            System.out.println();
        }
    }
}