/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz2;
import java.util.Scanner;
/**
 *
 * @author Muh. Rizal Maulana
 */
public class AntrianNasabahMain {
     public static void main(String[] args) {
        AntrianNasabah antrian = new AntrianNasabah();
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Cari Nasabah");
            System.out.println("3. Transaksi Selesai");
            System.out.println("4. Nasabah Darurat");
            System.out.println("5. Cetak Antrian Nasabah");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Masukkan nomor rekening: ");
                    String noRekening = scanner.nextLine();
                    System.out.print("Masukkan nama nasabah: ");
                    String nama = scanner.nextLine();
                    antrian.tambahNasabah(noRekening, nama);
                    System.out.println("Nasabah berhasil ditambahkan.");
                    break;
                case 2:
                    scanner.nextLine(); 
                    System.out.print("Masukkan nama nasabah yang ingin dicari: ");
                    String namaCari = scanner.nextLine();
                    Nasabah nasabahDitemukan = antrian.cariNasabah(namaCari);
                    if (nasabahDitemukan != null) {
                        System.out.println("\nNasabah ditemukan:");
                        nasabahDitemukan.print();
                    } else {
                        System.out.println("\nNasabah tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan jumlah transaksi yang selesai: ");
                    int jumlahTransaksiSelesai = scanner.nextInt();
                    System.out.println("\nSetelah transaksi selesai:");
                    antrian.selesaikanTransaksi(jumlahTransaksiSelesai);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Masukkan nomor rekening nasabah darurat: ");
                    String noRekeningDarurat = scanner.nextLine();
                    System.out.print("Masukkan nama nasabah darurat: ");
                    String namaDarurat = scanner.nextLine();
                    antrian.tambahNasabahDarurat(noRekeningDarurat, namaDarurat);
                    System.out.println("Nasabah darurat berhasil ditambahkan.");
                    break;
                case 5:
                    System.out.println("\nAntrian Nasabah:");
                    antrian.cetakAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.println();
        } while (pilihan != 0);
    }
}