/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author Muh. Rizal Maulana
 */
public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }
        else{
            System.out.println("Data Sudah Terpenuhi!!");
        }
    }
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-------------------");
        }
    }
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
}
