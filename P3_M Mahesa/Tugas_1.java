import java.io.*;

public class Tugas_1 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = 0, b = 0;

        try {
            System.out.print("Angka pertama : ");
            a = Double.parseDouble(br.readLine());

            System.out.print("Angka kedua   : ");
            b = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.out.println("Input error.");
            return;
        }

        double hasil = a / b;

        System.out.println();
        System.out.println("Hasil bagi (double) : " + hasil);
        System.out.println("Hasil bagi (int)    : " + (int) hasil); 
        System.out.println("Sisa bagi           : " + (a % b));

        if (hasil == (int) hasil) {
            System.out.println("Hasil adalah bilangan bulat.");
        } else {
            System.out.println("Hasil bukan bilangan bulat (ada desimal).");
        }
    }
}