/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;
import java.util.Scanner;
/**
 *
 * @author Muh. Rizal Maulana
 */
public class Paskibraka {
     String nama;
    String kelas;
    int tinggi;
    
    public Paskibraka(String nama, String kelas, int tinggi) {
        this.nama = nama;
        this.kelas = kelas;
        this.tinggi = tinggi;
    }
    
    public void tampilIdentitas() {
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Tinggi: " + tinggi + " cm");
    }
}

