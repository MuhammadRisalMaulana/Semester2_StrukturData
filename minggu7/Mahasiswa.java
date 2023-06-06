/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;
import java.util.Scanner;
/**
 *
 * @author Muh. Rizal Maulana
 */
public class Mahasiswa {
  String nama;
  int nilaiA;
  int nilaiB;
  int nilaiC;
  int total;

  // Constructor
  public Mahasiswa(String nama, int nilaiA, int nilaiB, int nilaiC) {
    this.nama = nama;
    this.nilaiA = nilaiA;
    this.nilaiB = nilaiB;
    this.nilaiC = nilaiC;
    this.total = nilaiA + nilaiB + nilaiC;
  }
}
