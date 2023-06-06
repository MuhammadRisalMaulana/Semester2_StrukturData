/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class tugas1_2 {
    public static void main(String[] args) {
        String[] namaBarang = {"Pensil", "Buku", "Penggaris", "Bulpen"};
        int[] stok = {35, 20, 50, 25};
        int[] harga = {1000, 5000, 1500, 2000};
        int n = stok.length;
        
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int keyStok = stok[i];
                String keyNama = namaBarang[i];
                int keyHarga = harga[i];
                int j;
                
                for (j = i; j >= gap && stok[j-gap] < keyStok; j -= gap) {
                    stok[j] = stok[j-gap];
                    namaBarang[j] = namaBarang[j-gap];
                    harga[j] = harga[j-gap];
                }
                stok[j] = keyStok;
                namaBarang[j] = keyNama;
                harga[j] = keyHarga;
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(namaBarang[i] + " - " + stok[i] + " - " + harga[i]);
        }
    }
}
