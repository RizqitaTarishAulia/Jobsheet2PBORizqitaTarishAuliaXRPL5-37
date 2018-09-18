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
public class TugasPraktikum1UjiBus {
   
    public static void main(String[] args) {
        int password;

        TugasPraktikum1Bus Tayo = new TugasPraktikum1Bus(40);
        Tayo.cetak();

        Tayo.getPenumpang(123);
        Tayo.cetak();

        Tayo.getPenumpang(121);
        Tayo.cetak();

        Tayo.getPenumpang(123);
        Tayo.cetak();

        System.out.println(" Rata-rata Penumpang : " + Tayo.getAverege());

    }

}

