/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu9;

import java.util.Scanner;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class StackMain {
    public static void main(String []args){
     Stack stk = new Stack(5);
     Scanner sc = new Scanner(System.in);
     
     char pilih;
     do {
    System.out.println("Jenis: ");
    String jenis = sc.nextLine();
    System.out.println("Warna: ");
    String warna = sc.nextLine();
    System.out.println("Merk: ");
    String merk = sc.nextLine();
    System.out.println("Ukuran: ");
    String ukuran = sc.nextLine();
    System.out.println("Harga: ");
    double harga = sc.nextDouble();
    
    Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah Anda Akan Memambahkan data terbaru ke stack (y/t)");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        } while (pilih == 'y');
     }
}
