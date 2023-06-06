/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class InsertionSortTest {
    public int[] data;
    public int jumData;

  public InsertionSortTest(int[] data, int jumData) {
    this.data = data;
    this.jumData = jumData;
  }

  public void tampilData() {
    for (int i = 0; i < jumData; i++) {
      System.out.print(data[i] + " ");
    }
    System.out.println();
  }

  public void insertion() {
    for (int i = 1; i < jumData; i++) {
      int key = data[i];
      int j = i - 1;
      while (j >= 0 && data[j] > key) {
        data[j+1] = data[j];
        j--;
      }
      data[j+1] = key;
    }
  }

  public static void main(String[] args) {
    int [] data = {73, 67, 56, 32, 52, 41, 83, 37, 32, 10};
    int jumData = data.length;

    InsertionSortTest insertionSort = new InsertionSortTest(data, jumData);
    System.out.println("Data awal: ");
    insertionSort.tampilData();

    insertionSort.insertion();
    System.out.println("Data setelah diurutkan: ");
    insertionSort.tampilData();
  }
}
