/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetpbo2;

/**
 *
 * @author Tarishaulia
 */
public class Latihan3TestSiswa {
    public static void main(String [] args){
        Latihan3EncapSiswa siswa = new Latihan3EncapSiswa();
        siswa.setName("Risa");
        siswa.setAbsen(37);
        siswa.setAddress("Malang");
        
        System.out.println("Name : "+ siswa.getName()+" Absen : " + siswa.getabsen()+ " Address : " +siswa.getAddress());
    }
}
