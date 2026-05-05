public class Latihan_1 {
    public static void main(String[] args) {

        byte b = 100;
        int i = b;
        long l = i;
        double d = l;

        System.out.println("byte  : " + b);
        System.out.println("int   : " + i);
        System.out.println("long  : " + l);
        System.out.println("double: " + d);

        System.out.println();

        double pi = 3.14159;
        int piInt = (int) pi;

        System.out.println("double asli : " + pi);
        System.out.println("setelah cast: " + piInt);

        System.out.println();

        int angka = 123456789;
        float angkaFloat = angka;

        System.out.println("int  : " + angka);
        System.out.println("float: " + angkaFloat); 
    }
}