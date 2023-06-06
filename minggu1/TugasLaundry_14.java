/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu1;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class TugasLaundry_14 {
    public static void main(String[] args) {
        double ratePerKg = 4500;
        int discountThreshold = 10;
        double discountRate = 0.05;

        
        int aniWeight = 4;
        int budiWeight = 15;
        int binaWeight = 6;
        int citaWeight = 11;

        double aniFee = aniWeight * ratePerKg;
        double budiFee = budiWeight * ratePerKg;
        double binaFee = binaWeight * ratePerKg;
        double citaFee = citaWeight * ratePerKg;


        if (budiWeight > discountThreshold) {
            budiFee *= (1 - discountRate);
        }
        if (citaWeight > discountThreshold) {
            citaFee *= (1 - discountRate);
        }

        double totalRevenue = aniFee + budiFee + binaFee + citaFee;


        System.out.printf("Pendapatan Smile Laundry pada hari ini adalah Rp. %.0f", totalRevenue);
    }
}
