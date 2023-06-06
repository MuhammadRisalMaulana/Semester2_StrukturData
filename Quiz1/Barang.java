/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz1;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class Barang {
    private String kode;
    private String nama;
    private int harga;
    private int stok;
    
    public Barang(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    public String getKode() {
        return kode;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public int getStok() {
        return stok;
    }
    
    public void setStok(int stok) {
        this.stok = stok;
    }
}

