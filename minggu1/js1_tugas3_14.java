/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1;

import java.text.DecimalFormat;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class js1_tugas3_14 {
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7},   // RoyalGarden 1
            {6, 9, 12, 0},    // RoyalGarden 2
            {2, 10, 10, 5},   // RoyalGarden 3
            {5, 7, 12, 9}     // RoyalGarden 4
        };
        
        // Membuat array untuk menyimpan harga bunga
        int[] harga = {75000, 50000, 60000, 10000};
        
        // A. Menghitung jumlah stock berdasarkan jenis bunga di seluruh cabang
        int[] totalStock = new int[harga.length];
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < harga.length; j++) {
                totalStock[j] += stock[i][j];
            }
        }
        System.out.println("Jumlah stock berdasarkan jenis bunga di seluruh cabang:");
        for (int i = 0; i < harga.length; i++) {
            System.out.println(String.format("%-10s= %d", getBungaName(i), totalStock[i]));
        }
        System.out.println();
        
        // B. Menghitung pendapatan dari RoyalGarden 1 jika semua bunga terjual habis
        int[] stockRG1 = stock[0];
        // Mengurangi jumlah stock sesuai dengan rincian yang diberikan
        stockRG1[0] -= 1;
        stockRG1[1] -= 2;
        stockRG1[3] -= 5;
        int totalPendapatan = 0;
        for (int i = 0; i < harga.length; i++) {
            totalPendapatan += stockRG1[i] * harga[i];
        }
        System.out.println("Pendapatan dari RoyalGarden 1 jika semua bunga terjual habis:");
        System.out.println("===============================================");
        for (int i = 0; i < harga.length; i++) {
            System.out.println(String.format("%-10s= %s", getBungaName(i), formatRupiah(stockRG1[i] * harga[i])));
        }
        System.out.println("-----------------------------------------------");
        System.out.println(String.format("%-10s= %s", "Total", formatRupiah(totalPendapatan)));
    }
    
    // Helper method untuk mengembalikan nama bunga berdasarkan index
    private static String getBungaName(int index) {
        switch(index) {
            case 0: return "Aglonema";
            case 1: return "Keladi";
            case 2: return "Alocasia";
            case 3: return "Mawar";
            default: return "";
        }
    }
    
    // Helper method untuk memformat angka ke dalam format rupiah
    private static String formatRupiah(int amount) {
        DecimalFormat df = new DecimalFormat("#,###");
        return "Rp. " + df.format(amount);
    }
}
