/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan31perkenalanmahasiswa;

/**
 *
 * @author Yogaputra
 * NAMA : ARDITYA YOGAPUTRA S
 * NIM : 10117119
 * KELAS : PBO3 / IF-3
 * Deskripsi Program : Menampilkan Perkenalan Mahasiswa
 */
public class PBO310117119Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10117119";
        mhs1.nama = "Arditya Yogaputra S";
        mhs1.perkenalkanDiri(mhs1.nim, mhs1.nama);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "10117116";
        mhs2.nama = "Muhammad Fitrayana";
        mhs2.perkenalkanDiri(mhs2.nim, mhs2.nama);
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = "10117104";
        mhs3.nama = "Aditya Suheryana";
        mhs3.perkenalkanDiri(mhs3.nim, mhs3.nama);

    }

}
