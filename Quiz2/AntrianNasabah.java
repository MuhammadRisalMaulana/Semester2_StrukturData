/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz2;
import java.util.Scanner;
/**
 *
 * @author Muh. Rizal Maulana
 */
public class AntrianNasabah {
    private Nasabah head;
    private Nasabah tail;

    public AntrianNasabah() {
        head = null;
        tail = null;
    }

    public void tambahNasabah(String noRekening, String nama) {
        Nasabah nasabahBaru = new Nasabah(noRekening, nama);
        if (head == null) {
            head = nasabahBaru;
            tail = nasabahBaru;
        } else {
            tail.setNext(nasabahBaru);
            tail = nasabahBaru;
        }
    }

    public Nasabah cariNasabah(String nama) {
        Nasabah current = head;
        while (current != null) {
            if (current.getNama().equalsIgnoreCase(nama)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void selesaikanTransaksi(int jumlahTransaksi) {
        for (int i = 0; i < jumlahTransaksi; i++) {
            if (head == null) {
                System.out.println("Antrian nasabah sudah habis.");
                break;
            } else {
                panggilNasabah();
            }
        }
    }

    public void panggilNasabah() {
        if (head == null) {
            System.out.println("Antrian kosong.");
        } else {
            Nasabah nasabahPanggil = head;
            head = head.getNext();
            nasabahPanggil.printData();
        }
    }

    public void tambahNasabahDarurat(String noRekening, String nama) {
        Nasabah nasabahDarurat = new Nasabah(noRekening, nama);
        if (head == null) {
            head = nasabahDarurat;
            tail = nasabahDarurat;
        } else {
            nasabahDarurat.setNext(head);
            head = nasabahDarurat;
        }
    }

    public void printAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
        } else {
            Nasabah current = head;
            while (current != null) {
                current.printData();
                current = current.getNext();
            }
        }
    }

    void cetakAntrian() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
