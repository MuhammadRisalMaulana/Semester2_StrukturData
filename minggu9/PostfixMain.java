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
public class PostfixMain {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String P,Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();
        
        Postfix post = new Postfix(total);
        P = post.konvensi(Q);
        System.out.println("Postfix: " + P);
    }
}
