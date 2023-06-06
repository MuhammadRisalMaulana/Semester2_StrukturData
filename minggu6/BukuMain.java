/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class BukuMain {
    public static void main(String[] args) {
        Buku[] daftarBuku = new Buku[] {
            new Buku("Basis data", 1292, 25.0),
            new Buku("Dasar Pemrograman", 400, 29.7),
            new Buku("Rekayasa Perangkat Lunak", 294, 35.3),
            new Buku("Algoritma pemrograman", 824, 50.0)
        };

        System.out.println("Sebelum diurutkan:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku.toString());
        }

        PengurutanBuku.bubbleSort(daftarBuku);
        System.out.println("\nSetelah diurutkan berdasarkan Ukuran Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku.toString());
        }

        PengurutanBuku.selectionSort(daftarBuku);
        System.out.println("\nSetelah diurutkan berdasarkan Jumlah Halaman:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku.toString());
        }
    }
}
