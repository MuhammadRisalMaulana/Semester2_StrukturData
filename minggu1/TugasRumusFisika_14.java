/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1;

import java.util.Scanner;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class TugasRumusFisika_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double kecepatan, jarak, waktu;

        System.out.println("=== PROGRAM MENGHITUNG RUMUS KECEPATAN, JARAK, DAN WAKTU ===");
        System.out.println("1. Rumus Kecepatan");
        System.out.println("2. Rumus Jarak");
        System.out.println("3. Rumus Waktu");
        System.out.print("Pilih rumus yang akan dihitung: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jarak (meter): ");
                jarak = input.nextDouble();
                System.out.print("Masukkan waktu (detik): ");
                waktu = input.nextDouble();
                kecepatan = jarak / waktu;
                System.out.println("Kecepatan = " + kecepatan + " m/s");
                break;

            case 2:
                System.out.print("Masukkan kecepatan (m/s): ");
                kecepatan = input.nextDouble();
                System.out.print("Masukkan waktu (detik): ");
                waktu = input.nextDouble();
                jarak = kecepatan * waktu;
                System.out.println("Jarak = " + jarak + " meter");
                break;

            case 3:
                System.out.print("Masukkan jarak (meter): ");
                jarak = input.nextDouble();
                System.out.print("Masukkan kecepatan (m/s): ");
                kecepatan = input.nextDouble();
                waktu = jarak / kecepatan;
                System.out.println("Waktu = " + waktu + " detik");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        input.close();
    }
}
