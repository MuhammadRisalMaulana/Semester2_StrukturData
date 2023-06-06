/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class Tugas1_Silinder {
    double jariJari;
     double tinggi;

    public Tugas1_Silinder(double jr, double t) {
        jariJari = jr;
        tinggi = t;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    } 
}
