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
public class TugasPraktikum2Hasil {
  public static void main(String[] args) {
        double r = 14;
        TugasPraktikum2 bola = new TugasPraktikum2(7);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        System.out.println();
        System.out.println();
        System.out.println();

        bola.setJarijari(r);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
    }
}

