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
public class js1_tugas1_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai tugas (0-100): ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai UTS (0-100): ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan nilai UAS (0-100): ");
        double nilaiUAS = input.nextDouble();

        // menghitung nilai akhir dengan bobot 20%, 35%, dan 45%
        double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiUTS * 0.35) + (nilaiUAS * 0.45);

        System.out.println("Nilai Akhir: " + nilaiAkhir);

        // konversi nilai akhir menjadi nilai huruf
        String nilaiHuruf;
        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // menampilkan nilai huruf dan status kelulusan
        if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Status: TIDAK LULUS");
        } else {
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Status: LULUS");
        }
    
        }
}
