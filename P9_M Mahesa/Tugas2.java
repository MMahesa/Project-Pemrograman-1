// class implements lebih dari satu interface
interface Identitas {
    public String getNama();
    public String getId();
}

interface Aktivitas {
    public void belajar();
    public void kerja();
}

class Siswa implements Identitas, Aktivitas {
    private String nama, nis;

    public Siswa(String nama, String nis) {
        this.nama = nama;
        this.nis  = nis;
    }

    public String getNama() { return nama; }
    public String getId()   { return nis; }

    public void belajar() {
        System.out.println(nama + " belajar di kelas.");
    }
    public void kerja() {
        System.out.println(nama + " mengerjakan tugas.");
    }
}

class Guru implements Identitas, Aktivitas {
    private String nama, nip;

    public Guru(String nama, String nip) {
        this.nama = nama;
        this.nip  = nip;
    }

    public String getNama() { return nama; }
    public String getId()   { return nip; }

    public void belajar() {
        System.out.println(nama + " belajar hal baru.");
    }
    public void kerja() {
        System.out.println(nama + " mengajar di kelas.");
    }
}

public class Tugas2 {
    public static void main(String[] args) {
        Siswa s = new Siswa("Andi", "2024001");
        Guru  g = new Guru("Bu Sari", "198901");

        System.out.println("Nama: " + s.getNama() + " | NIS: " + s.getId());
        s.belajar();
        s.kerja();

        System.out.println();

        System.out.println("Nama: " + g.getNama() + " | NIP: " + g.getId());
        g.belajar();
        g.kerja();
    }
}