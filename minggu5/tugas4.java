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
public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah penduduk: ");
        int jumlahPenduduk = input.nextInt();

        String[] nik = new String[jumlahPenduduk];
        String[] nama = new String[jumlahPenduduk];
        String[] alamat = new String[jumlahPenduduk];
        String[] jenisKelamin = new String[jumlahPenduduk];

        // Input data penduduk
        for (int i = 0; i < jumlahPenduduk; i++) {
            System.out.println("\nData penduduk ke-" + (i+1));
            System.out.print("NIK: ");
            nik[i] = input.next();
            System.out.print("Nama: ");
            nama[i] = input.next();
            System.out.print("Alamat: ");
            alamat[i] = input.next();
            System.out.print("Jenis Kelamin: ");
            jenisKelamin[i] = input.next();
        }

        System.out.print("\nMasukkan NIK yang ingin dicari: ");
        String cariNIK = input.next();
        boolean ditemukan = false;
        for (int i = 0; i < jumlahPenduduk; i++) {
            if (nik[i].equals(cariNIK)) {
                System.out.println("\nData penduduk ditemukan:");
                System.out.println("NIK: " + nik[i]);
                System.out.println("Nama: " + nama[i]);
                System.out.println("Alamat: " + alamat[i]);
                System.out.println("Jenis Kelamin: " + jenisKelamin[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("\nData penduduk tidak ditemukan");
        }
    }
}
