/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1;

import java.util.Scanner;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class js1_tugas4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM Anda: ");
        int nim = input.nextInt();
        int n = (nim % 100 < 10) ? nim % 100 + 10 : nim % 100;
        String[] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        for (int i = 0; i < n; i++) {
            System.out.print(days[i % 7] + " ");
            if (i % 7 == 6) {
                System.out.println();
            }
        }
    }
}
