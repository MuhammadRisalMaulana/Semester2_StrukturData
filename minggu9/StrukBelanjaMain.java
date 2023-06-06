/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu9;
import java.util.Stack;
/**
 *
 * @author Muh. Rizal Maulana
 */
public class StrukBelanjaMain {
    public static void main(String[] args) {
        Stack<StrukBelanja> strukBelanjaStack = new Stack<>();

        // Menambahkan data struk belanja ke stack
        strukBelanjaStack.push(new StrukBelanja(1, "01/03/2023", 5, 500000));
        strukBelanjaStack.push(new StrukBelanja(2, "04/03/2023", 2, 250000));
        strukBelanjaStack.push(new StrukBelanja(3, "07/03/2023", 3, 300000));
        strukBelanjaStack.push(new StrukBelanja(4, "10/03/2023", 1, 100000));
        strukBelanjaStack.push(new StrukBelanja(5, "13/03/2023", 6, 600000));
        strukBelanjaStack.push(new StrukBelanja(6, "16/03/2023", 4, 400000));
        strukBelanjaStack.push(new StrukBelanja(7, "19/03/2023", 2, 200000));
        strukBelanjaStack.push(new StrukBelanja(8, "22/03/2023", 5, 550000));

        System.out.println("Data Struk Belanja yang Tersimpan di Dalam Stack:");
        for (StrukBelanja strukBelanja : strukBelanjaStack) {
            System.out.println(strukBelanja);
        }

        int jumlahStrukDitukar = 5;
        System.out.println("\nStruk Belanja yang Akan Ditukar dengan Voucher Belanja:");
        for (int i = 0; i < jumlahStrukDitukar; i++) {
            StrukBelanja strukBelanja = strukBelanjaStack.pop();
            System.out.println(strukBelanja);
        }
    }
}
