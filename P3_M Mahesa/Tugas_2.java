import java.io.*;
import java.text.*;

public class Tugas_2 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double harga = 0;
        int qty = 0;

        try {
            System.out.print("Harga barang : ");
            harga = Double.parseDouble(br.readLine());

            System.out.print("Jumlah beli  : ");
            qty = Integer.parseInt(br.readLine()); 
        } catch (IOException e) {
            System.out.println("Input error.");
            return;
        }

        double total = harga * qty;
        double pajak = total * 0.11;   // PPN 11%
        double bayar = total + pajak;

        // Format tampilan pakai NumberFormat
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent  = NumberFormat.getPercentInstance();

        System.out.println();
        System.out.println("=== Struk Belanja ===");
        System.out.println("Subtotal  : " + currency.format(total));
        System.out.println("PPN (11%) : " + currency.format(pajak));
        System.out.println("Total     : " + currency.format(bayar));
        System.out.println("Pajak %   : " + percent.format(0.11));

        // Casting: bulatkan total ke int (truncation)
        System.out.println("Dibulatkan: Rp" + (int) bayar);
    }
}