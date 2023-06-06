/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class Tugas1_Bola {
     double jariJari;

    public Tugas1_Bola(double jr) {
        jariJari = jr;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}
