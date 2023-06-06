/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz1;
import java.util.Scanner;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class BarangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Barang[] arrBarang = {
            new Barang("B001", "Indomie", 2500, 100),
            new Barang("B002", "Pocari Sweat", 6000, 50),
            new Barang("B003", "Mie Sedap", 2800, 75),
            new Barang("B004", "Chitato", 7500, 30),
            new Barang("B005", "Aqua", 2000, 90)
        };

        transaksiBarang transaksiBarang = new transaksiBarang(arrBarang);

        int menu;
        do {
            System.out.println("============MENU=============");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Tampilkan Barang Pembelian");
            System.out.println("3. Melakukan Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu [1-4]: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    transaksiBarang.tampilkanBarang();
                    break;
                case 2:
                    transaksiBarang.tampilkanBarangPembelian();
                    break;
                case 3:
                    System.out.print("Masukkan kode barang: ");
                    String kode = sc.next();
                    System.out.print("Masukkan jumlah barang: ");
                    int jumlah = sc.nextInt();
                    transaksiBarang.belanja(kode, jumlah);
                    break;
                case 4:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan ulangi!");
                    break;
            }

            System.out.println();
        } while (menu != 4);
    }
}