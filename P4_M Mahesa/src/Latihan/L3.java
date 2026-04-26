/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Mahesa
 */

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            float makan, transport, belanja;

            System.out.print("Pengeluaran makan: ");
            makan = input.nextFloat();
            System.out.print("Pengeluaran transport: ");
            transport = input.nextFloat();
            System.out.print("Pengeluaran belanja: ");
            belanja = input.nextFloat();

            float total      = makan + transport + belanja;
            float diskon     = total * 0.10f;
            float totalBayar = total - diskon;

            System.out.println("\n=== HASIL ===");
            System.out.println("Total           : " + total);
            System.out.println("Diskon (10%)    : " + diskon);
            System.out.println("Total bayar     : " + totalBayar);
        }
    }
}