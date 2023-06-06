/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Muh. Rizal Maulana
 */
public class transaksiBarang {
    private List<Barang> barangs;
    private List<Integer> pembelians;
    
    public transaksiBarang(List<Barang> barangs) {
        this.barangs = barangs;
        pembelians = new ArrayList<>();
        for (int i = 0; i < barangs.size(); i++) {
            pembelians.add(0);
        }
    }

    transaksiBarang(Barang[] arrBarang) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void tampilkanBarang() {
        System.out.println("Kode  Nama                Harga  Stok");
        for (Barang barang : barangs) {
            System.out.printf("%-5s %-20s %6d %5d\n", barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok());
        }
    }
    
    public void tampilkanBarangPembelian() {
        System.out.println("Kode  Nama                Harga  Jumlah");
        int i = 0;
        for (Barang barang : barangs) {
            if (pembelians.get(i) > 0) {
                System.out.printf("%-5s %-20s %6d %5d\n", barang.getKode(), barang.getNama(), barang.getHarga(), pembelians.get(i));
            }
            i++;
        }
    }
    
    public void melakukanPembelian(String kode, int jumlah) {
        int i = 0;
        for (Barang barang : barangs) {
            if (barang.getKode().equals(kode)) {
                if (barang.getStok() >= jumlah) {
                    pembelians.set(i, pembelians.get(i) + jumlah);
                    barang.setStok(barang.getStok() - jumlah);
                    System.out.println("Pembelian berhasil!");
                } else {
                    System.out.println("Stok tidak mencukupi.");
                }
                return;
            }
            i++;
        }
        System.out.println("Barang tidak ditemukan.");
    }
    
    public void tampilkanDaftarPembelian() {
        System.out.println("Kode  Nama                Harga  Jumlah  Total");
        int i = 0;
        int total = 0;
        for (Barang barang : barangs) {
            if (pembelians.get(i) > 0) {
                int subtotal = barang.getHarga() * pembelians.get(i);
                System.out.printf("%-5s %-20s %6d %5d %6d\n", barang.getKode(), barang.getNama(), barang.getHarga(), pembelians.get(i), subtotal);
                total += subtotal;
            }
            i++;
        }
    }

    void belanja(String kode, int jumlah) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

