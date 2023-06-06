/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz2;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class Nasabah {
    private String noRekening;
    private String nama;
    private Nasabah next;

    public Nasabah(String noRekening, String nama) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.next = null;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNama() {
        return nama;
    }

    public Nasabah getNext() {
        return next;
    }

    public void setNext(Nasabah next) {
        this.next = next;
    }

    void printData() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
