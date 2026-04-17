/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author Mahesa
 */

import java.util.Scanner;

public class Latihan_2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            float makan, transport, belanja;

            System.out.print("Pengeluaran makan: ");
            makan = input.nextFloat();
            System.out.print("Pengeluaran transport: ");
            transport = input.nextFloat();
            System.out.print("Pengeluaran belanja: ");
            belanja = input.nextFloat();

            float total = makan + transport + belanja;
            float p_makan     = makan / total * 100;
            float p_transport = transport / total * 100;
            float p_belanja   = belanja / total * 100;

            System.out.println("\n=== HASIL ===");
            System.out.println("Total            : " + total);
            System.out.println("Makan            : " + p_makan + "%");
            System.out.println("Transport        : " + p_transport + "%");
            System.out.println("Belanja          : " + p_belanja + "%");
        }
    }
}