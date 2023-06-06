/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class MahasiswaMain {
  public static void insertionSort(Mahasiswa[] arr) {
    for (int i = 1; i < arr.length; i++) {
      Mahasiswa key = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j].total < key.total) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }

      arr[j + 1] = key;
    }
  }

  public static void printTopThree(Mahasiswa[] arr) {
    System.out.println("3 Mahasiswa terbaik:");

    for (int i = 0; i < 3; i++) {
      System.out.println((i+1) + ". " + arr[i].nama + " - Total nilai: " + arr[i].total);
    }
  }

  public static void main(String[] args) {

    Mahasiswa[] mahasiswa = new Mahasiswa[5];
    mahasiswa[0] = new Mahasiswa("Rizki", 80, 90, 75);
    mahasiswa[1] = new Mahasiswa("Indah", 90, 80, 85);
    mahasiswa[2] = new Mahasiswa("Dika", 70, 80, 90);
    mahasiswa[3] = new Mahasiswa("Hisam", 50, 90, 90);
    mahasiswa[4] = new Mahasiswa("Budi", 100, 100, 90);

    insertionSort(mahasiswa);

    printTopThree(mahasiswa);
  }
}