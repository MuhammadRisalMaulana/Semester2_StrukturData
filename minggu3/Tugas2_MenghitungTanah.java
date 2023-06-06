/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class Tugas2_MenghitungTanah {
    private int panjang;
    private int lebar;
    
    public Tugas2_MenghitungTanah(int p, int l) {
        panjang = p;
        lebar = l;
    }
    
    public int getPanjang() {
        return panjang;
    }
    
    public int getLebar() {
        return lebar;
    }
    
    public int hitungLuas() {
        return panjang * lebar;
    }
}
