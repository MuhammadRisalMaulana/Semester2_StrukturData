/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;
import java.util.Scanner;
/**
 *
 * @author Muh. Rizal Maulana
 */
public class Tugas1Main {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi kubus: ");
        double sisiKubus = input.nextDouble();
        Tugas1_Kubus kubus = new Tugas1_Kubus(sisiKubus);

        System.out.print("Masukkan jari-jari bola: ");
        double jariJariBola = input.nextDouble();
        Tugas1_Bola bola = new Tugas1_Bola(jariJariBola);

        System.out.print("Masukkan jari-jari silinder: ");
        double jariJariSilinder = input.nextDouble();
        System.out.print("Masukkan tinggi silinder: ");
        double tinggiSilinder = input.nextDouble();
        Tugas1_Silinder silinder = new Tugas1_Silinder(jariJariSilinder, tinggiSilinder);

        System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());
        System.out.println("Volume kubus: " + kubus.hitungVolume());

        System.out.println("Luas permukaan bola: " + bola.hitungLuasPermukaan());
        System.out.println("Volume bola: " + bola.hitungVolume());

        System.out.println("Luas permukaan silinder: " + silinder.hitungLuasPermukaan());
        System.out.println("Volume silinder: " + silinder.hitungVolume());
    }
}
