/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu9;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class StrukBelanja {
    int nomorTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    double totalHargaBayar;
  
  public StrukBelanja(int nomorTransaksi, String tanggalPembelian, int jumlahBarang, double totalHargaBayar) {
    this.nomorTransaksi = nomorTransaksi;
    this.tanggalPembelian = tanggalPembelian;
    this.jumlahBarang = jumlahBarang;
    this.totalHargaBayar = totalHargaBayar;
  }
  
  public String toString() {
    return "Nomor transaksi: " + nomorTransaksi + ", Tanggal pembelian: " + tanggalPembelian + ", Jumlah barang: " + jumlahBarang + ", Total harga bayar: " + totalHargaBayar;
  }
}
