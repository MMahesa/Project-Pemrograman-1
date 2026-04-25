import  java.util.Scanner ;
    public class Latihan1 {
        @SuppressWarnings("resource")
        public static void main(String[] args) {
            Scanner input = new  Scanner(System.in);
            String nama; 
            int usia ;
            System.out.print("Input Nama: ");
            nama = input.nextLine();
            System.out.print("Nama: " + nama); 
            usia = input.nextInt();
            System.out.print(usia);
            System.out.print("Usia:" + usia);
        }
    }