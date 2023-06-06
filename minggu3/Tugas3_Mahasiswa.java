/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;
import java.util.Scanner;
/**
 *
 * @author Muh. Rizal Maulana
 */
public class Tugas3_Mahasiswa {
     String nama, nim, jenisKelamin;
  double ipk;
  
  public void inputData(int i) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan data mahasiswa ke- " + i);
    System.out.print("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print("Masukkan nim: ");
    nim = sc.nextLine();
    System.out.print("Masukkan jenis kelamin: ");
    jenisKelamin = sc.nextLine();
    System.out.print("Masukkan IPK: ");
    ipk = sc.nextDouble();
  }
  
  public void tampilData(int i) {
    System.out.println("Data Mahasiswa ke-" + i);
    System.out.println("nama : " + this.nama);
    System.out.println("nim : " + this.nim);
    System.out.println("Jenis kelamin : " + this.jenisKelamin);
    System.out.println("Nilai IPK : " + this.ipk);
  }
}
