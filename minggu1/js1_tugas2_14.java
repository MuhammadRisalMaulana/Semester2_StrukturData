/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class js1_tugas2_14 {
     public static void main(String[] args) {
        int n = 03; // ganti dengan 2 digit terakhir NIM Anda
        if (n < 10) {
            n += 10;
        }

        LocalDate date = LocalDate.now().with(DayOfWeek.MONDAY);
        for (int i = 0; i < n; i++) {
            System.out.println(date.getDayOfWeek());
            date = date.plusDays(1);
        }
    }
}
