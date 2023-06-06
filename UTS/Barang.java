/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class Barang {
    private String kode;
    private String namaBarang;
    private int stok;
    private int hargaSatuan;

    public Barang(String kode, String namaBarang, int stok, int hargaSatuan) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getTotalHarga(int jumlahBeli) {
        return hargaSatuan * jumlahBeli;
    }

    public int getJumlahBeli() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getTotalHarga() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
