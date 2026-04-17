/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_5;


/**
 *
 * @author Mahesa
 */

import java.util.Scanner;
public class Latihan_1 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input Kehadiran: ");
            int kehadiran = input.nextInt();
            System.out.print("Input Nilai: ");
            int nilai = input.nextInt();

            if (kehadiran >= 75) {
                String grade;
                if (nilai >= 80) {
                    grade = "A";
                } else if (nilai >= 70) {
                    grade = "B";
                } else if (nilai >= 60) {
                    grade = "C";
                } else if (nilai >= 55) {
                    grade = "D";
                } else {
                    grade = "E";
                }
                System.out.println("Nilai: " + nilai);
                System.out.println("Grade: " + grade);
                if (grade.equals("E")) System.out.println("Status: Tidak Lulus");
            } else {
                if (nilai >= 55) {
                    System.out.println("Nilai: 55");
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Nilai: " + nilai);
                    System.out.println("Grade: E");
                    System.out.println("Status: Tidak Lulus");
                }
            }
        }
    }
}