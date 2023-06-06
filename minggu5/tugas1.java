/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class tugas1 {
    public static void main(String[] args) {
        int[] arr = {17, 20, 26, 33, 37, 41, 53, 65, 73, 83};
        int x = 41;

        int index = sequentialSearch(arr, x);

        if (index == -1) {
            System.out.println("Nilai " + x + " tidak ditemukan dalam array.");
        } else {
            System.out.println("Nilai " + x + " ditemukan pada index ke-" + index + " dalam array.");
        }
    }

    public static int sequentialSearch(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
