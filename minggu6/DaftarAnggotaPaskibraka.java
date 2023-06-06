/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

import java.util.Arrays;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class DaftarAnggotaPaskibraka {
    Paskibraka[] listPeserta = new Paskibraka[10];
    int id = 0;
    
    public void tambah(Paskibraka m) {
        if (id < 10) {
            listPeserta[id] = m;
            id++;
        } else {
            System.out.println("Kuota penuh!");
        }
    }
    
    public void tampil() {
        System.out.println("Daftar Peserta Paskibraka:");
        for (int i = 0; i < id; i++) {
            System.out.println((i+1) + ". " + listPeserta[i].nama);
        }
    }
    
    public void Sorting() {
        Arrays.sort(listPeserta, 0, id, (a, b) -> b.tinggi - a.tinggi);
    }
    
    public void seleksiTinggi() {
        int jumlahLolos = 0;
        for (int i = 0; i < id; i++) {
            if (listPeserta[i].tinggi >= 170) {
                System.out.println((jumlahLolos+1) + ". " + listPeserta[i].nama + " (" + listPeserta[i].tinggi + " cm)");
                jumlahLolos++;
            }
        }
        if (jumlahLolos == 0) {
            System.out.println("Tidak ada siswa yang lolos seleksi.");
        } else {
            System.out.println("Jumlah siswa yang lolos seleksi: " + jumlahLolos);
        }
    }
}
