/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;
import java.util.Scanner;
/**
 *
 * @author Muh. Rizal Maulana
 */
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;
        
        for(int i=0; i<jumMhs; i++){
            System.out.print("Nama = ");
            String nama = s1.nextLine();
            System.out.print("Thn masuk = ");
            int thn = s1.nextInt();
            System.out.print("Umur = ");
            int umur = s1.nextInt();
            System.out.print("IPK = ");
            double ipk = s1.nextDouble();
            
            Mahasiswa m =new Mahasiswa(nama,thn,umur,ipk);
            data.tambah(m);
        }
        System.out.println("----------------------------");
        System.out.println("Data Mahasiswa sebelum sorting =");
        data.tampil();
    }
}
