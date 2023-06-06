/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class BarangMain {
        static List<Barang> daftarBarang = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihanMenu;
        do {
            System.out.println("\nMenu Program Barang");
            System.out.println("1. Input Data Barang");
            System.out.println("2. Penjualan Barang");
            System.out.println("3. Mengurutkan Data Barang");
            System.out.println("4. Menampilkan Barang Terlaris");
            System.out.println("5. Tampil Seluruh Data Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihanMenu = input.nextInt();
            switch (pilihanMenu) {
                case 1:
                    inputBarang();
                    break;
                case 2:
                    penjualanBarang();
                    break;
                case 3:
                    urutkanBarang();
                    break;
                case 4:
                    tampilkanBarangTerlaris();
                    break;
                case 5:
                    tampilDataBarang();
                    break;
                case 0:
                    System.out.println("Program selesai, terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan ulangi!");
                    break;
            }
        } while (pilihanMenu != 0);
    }

    private static void inputBarang() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nInput Data Barang");
        System.out.print("Kode Barang: ");
        String kode = input.next();
        System.out.print("Nama Barang: ");
        String namaBarang = input.next();
        System.out.print("Stok Barang: ");
        int stok = input.nextInt();
        System.out.print("Harga Satuan Barang: ");
        int hargaSatuan = input.nextInt();
        Barang barang = new Barang(kode, namaBarang, stok, hargaSatuan);
        daftarBarang.add(barang);
        System.out.println("Data barang berhasil ditambahkan!");
    }

    private static void BarangMain() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nPenjualan Barang");

        List<Barang> keranjang = new ArrayList<>();
        int totalBayar = 0;
        input.nextLine(); // Membersihkan newline yang masih ada di buffer setelah membaca input sebelumnya
        do {
            System.out.print("Kode Barang (0 untuk selesai): ");
            String kode = input.nextLine();
            if (kode.equals("0")) {
                break;
            }
            Barang barang = cariBarang(kode);
            if (barang == null) {
                System.out.println("Barang tidak ditemukan, silakan ulangi!");
            } else {
                System.out.print("Jumlah Beli: ");
                int jumlahBeli = input.nextInt();
                if (jumlahBeli > barang.getStok()) {
                    System.out.println("Stok barang tidak mencukupi, silakan ulangi!");
                } else {
                    barang.setStok(barang.getStok() - jumlahBeli);
                    keranjang.add(new Barang(barang.getKode(), barang.getNamaBarang(), jumlahBeli, barang.getHargaSatuan()));
                    totalBayar += barang.getTotalHarga(jumlahBeli);
                    System.out.println("Barang berhasil ditambahkan ke keranjang!");
                }
            }
    public static void urutkanBarang() {
    throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static void penjualanBarang() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void tampilkanBarangTerlaris() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static void tampilDataBarang() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static Barang cariBarang(String kode) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
    


