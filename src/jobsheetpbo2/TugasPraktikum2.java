/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetpbo2;
import java.lang.Math;
/**
 *
 * @author Tarishaulia
 */
public class TugasPraktikum2 {

    private double r;

    public TugasPraktikum2(double r) {
        this.r = r;
    }

    public void setJarijari(double r) {
        this.r = r;
    }

    public void showDiameter() {
        System.out.println(" Diameter Bola       : " + 2 * r);
    }

    public void showLuasPermukaan() {
        System.out.println(" Luas Permukaan Bola : " + (4 / 3 * Math.PI * Math.pow(r, 3)));
    }

    public void showVolume() {
        System.out.println(" Volume Bola         : " + (4 * Math.PI * Math.pow(r, 2)));
    }
}

