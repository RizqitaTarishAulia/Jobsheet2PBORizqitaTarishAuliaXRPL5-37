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
public class Latihan4UjiBus {
    public static void main(String[] args){
        Latihan4Bus Bus = new Latihan4Bus(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang (2);//tambah 2 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang (1);//tambah 2 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang (2);//tambah 2 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang (2);//tambah 2 penumpang
        Bus.cetakpenumpang();
    }
}
