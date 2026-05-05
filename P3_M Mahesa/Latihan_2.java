import java.io.*;

public class Latihan_2 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        int umur = 0;

        try {
            System.out.print("Masukkan nama  : ");
            nama = br.readLine();

            System.out.print("Masukkan umur  : ");
            umur = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input.");
        }

        System.out.println();
        System.out.println("Halo, " + nama + "!");
        System.out.println("Kamu berumur " + umur + " tahun.");

        
        long umurBulan = (long) umur * 12;
        System.out.println("Itu sekitar " + umurBulan + " bulan.");
    }
}