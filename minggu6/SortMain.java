/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class SortMain {
   public static void main(String[] args) {
        int[] data = {15, 10, 7, 22, 5};
        Sort urut = new Sort(data, data.length);
        System.out.println("Data sebelum urut");
        urut.tampilData();
        urut.bubbleSort();
        urut.selectionSort();
        System.out.println("Data sesudah urut Bubble sort (ASC)");
        urut.tampilData();
        System.out.println("Data sesudah urut Selection sort (ASC)");
        urut.tampilData();
    }
}

