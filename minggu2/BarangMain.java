/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;
/**
 *
 * @author Muh. Rizal Maulana
 */
public class BarangMain {
    public static void main(String[] args){
        Barang b1 = new Barang ();
        b1.namaBarang = "Corsair 2GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah ="+hargaTotal);
        Barang b2 = new Barang ("Logitech" , "Wireless Mouse", 25, 150000);
        b2.tampilBarang();

    }
}
