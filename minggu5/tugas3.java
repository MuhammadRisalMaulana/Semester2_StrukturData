/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class tugas3 {
    public static void main(String[] args) {
        int[] arr = {12, 15, 6, 3, 70, 51, 83, 15, 3, 83};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Nilai terbesar pada array adalah: " + max);

        System.out.print("Nilai terbesar ditemukan pada posisi: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}
