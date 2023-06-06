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
public class Tugas3_MahasiswaMain {
    public static void main(String[] args) {
    Tugas3_Mahasiswa[] mahasiswa = new Tugas3_Mahasiswa[3];
    for (int i = 0; i < mahasiswa.length; i++) {
      mahasiswa[i] = new Tugas3_Mahasiswa();
      mahasiswa[i].inputData(i+1);
    }
    for (int i = 0; i < mahasiswa.length; i++) {
      mahasiswa[i].tampilData(i+1);
    }
  }
}
