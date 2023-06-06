/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class ShellSortTest {
    private int[] data;
    private int jumData;

    public ShellSortTest(int[] data, int jumData) {
        this.data = data;
        this.jumData = jumData;
    }

    public void tampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void shellSort() {
        int jarak = jumData / 2;
        while (jarak > 0) {
            for (int i = jarak; i < jumData; i++) {
                int temp = data[i];
                int j = i;
                while (j >= jarak && data[j - jarak] > temp) {
                    data[j] = data[j - jarak];
                    j -= jarak;
                }
                data[j] = temp;
            }
            jarak /= 2;
        }
    }
    public static void main(String[] args) {
        int[] data = {9, 5, 2, 7, 1, 8, 4, 6, 3};
        ShellSortTest sorter = new ShellSortTest(data, data.length);
        System.out.println("Data awal:");
        sorter.tampilData();
        sorter.shellSort();
        System.out.println("Data setelah diurutkan:");
        sorter.tampilData();
    }
}
