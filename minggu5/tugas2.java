/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;
import java.util.Scanner;
/**
 *
 * @author Muh. Rizal Maulana
 */
public class tugas2 {
    public static void main(String[] args) {
        System.out.println("Daftar Kelompok Mahasiswa");
        System.out.println("Kelompok 1 : Alfi     Safira      Tiara       Arif          Erdi ");
        System.out.println("Kelompok 2 : Yuda     Nisa        Yulia       Fauzan        Dwi  ");
        System.out.println("Kelompok 3 : Dewa     Ana         Abdul       Dani          Ammar"); 
        String[][] students = {
            {"Alfi", "Safira", "Tiara", "Arif", "Erdi"},
            {"Yudha", "Nisa", "Yulia", "Fauzan", "Dwi"},
            {"Dewa", "Ana", "Abdul", "Dani", "Ammar"}
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        String name = input.nextLine();

        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                if (students[i][j].equals(name)) {
                    System.out.printf("Mahasiswa bernama %s berada pada kelompok ke-%d, urutan ke-%d%n dalam kelompok", name, i+1, j+1);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.printf("Mahasiswa \"%s\" tidak dapat ditemukan.%n", name);
        }
    }
}
