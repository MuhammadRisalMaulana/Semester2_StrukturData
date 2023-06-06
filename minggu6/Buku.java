/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class Buku { 
    private String judulBuku;
    private int jumlahHalaman;
    private double tinggiBuku;

    public Buku(String judulBuku, int jumlahHalaman, double tinggiBuku) {
        this.judulBuku = judulBuku;
        this.jumlahHalaman = jumlahHalaman;
        this.tinggiBuku = tinggiBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public double getTinggiBuku() {
        return tinggiBuku;
    }

    @Override
    public String toString() {
        return String.format("%s - Jumlah Halaman: %d - Ukuran Buku: %.1f cm", judulBuku, jumlahHalaman, tinggiBuku);
    }
}

class PengurutanBuku {
    public static void bubbleSort(Buku[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i].getTinggiBuku() > arr[i + 1].getTinggiBuku()) {
                    Buku temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void selectionSort(Buku[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].getJumlahHalaman() < arr[minIndex].getJumlahHalaman()) {
                    minIndex = j;
                }
            }
            Buku temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
