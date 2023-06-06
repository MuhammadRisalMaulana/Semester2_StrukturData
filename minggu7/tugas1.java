/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;
import java.util.Scanner;
/**
 *
 * @author Muh. Rizal Maulana
 */
public class tugas1 {
    public static void main(String[] args) {
        String[] namaBarang = {"Pensil", "Buku", "Penggaris", "Bulpen"};
        int[] stok = {35, 20, 50, 25};
        int[] harga = {1000, 5000, 1500, 2000};
        int n = stok.length;
        
        for (int i = 1; i < n; i++) {
            int keyStok = stok[i];
            String keyNama = namaBarang[i];
            int keyHarga = harga[i];
            int j = i - 1;
            
            while (j >= 0 && stok[j] < keyStok) {
                stok[j+1] = stok[j];
                namaBarang[j+1] = namaBarang[j];
                harga[j+1] = harga[j];
                j = j - 1;
            }
            stok[j+1] = keyStok;
            namaBarang[j+1] = keyNama;
            harga[j+1] = keyHarga;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(namaBarang[i] + " - " + stok[i] + " - " + harga[i]);
        }
    }
}
