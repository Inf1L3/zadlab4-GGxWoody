/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Przemysław Paliński
 */
public class Kula implements FiguraPrzestrzenna {

    private double promien;

    public Kula(double promien) {
        this.promien = promien;
    }

    @Override
    public void obliczObjetosc() {
        System.out.println((4/3)*Math.PI*Math.pow(promien, 3));
    }

}
