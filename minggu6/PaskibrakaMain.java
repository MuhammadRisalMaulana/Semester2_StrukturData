/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class PaskibrakaMain {
    public static void main(String[] args) {
    DaftarAnggotaPaskibraka daftar = new DaftarAnggotaPaskibraka();
    
    Paskibraka siswa1 = new Paskibraka("Andi", "XI IPA 1", 180);
    Paskibraka siswa2 = new Paskibraka("Budi", "XI IPA 2", 175);
    Paskibraka siswa3 = new Paskibraka("Cindy", "XI IPS 1", 172);
    Paskibraka siswa4 = new Paskibraka("Dodi", "XI IPS 2", 168);
    Paskibraka siswa5 = new Paskibraka("Eva", "XI IPA 1", 173);
    Paskibraka siswa6 = new Paskibraka("Fikri", "XI IPA 2", 178);
    
    daftar.tambah(siswa1);
    daftar.tambah(siswa2);
    daftar.tambah(siswa3);
    daftar.tambah(siswa4);
    daftar.tambah(siswa5);
    daftar.tambah(siswa6);
    
    System.out.println("Sebelum diurutkan:");
    daftar.tampil();
    
    daftar.Sorting();
    
    System.out.println("\nSetelah diurutkan berdasarkan tinggi badan:");
    daftar.tampil();
    
    System.out.println("\nSiswa yang lolos seleksi:");
    daftar.seleksiTinggi();
}
}
