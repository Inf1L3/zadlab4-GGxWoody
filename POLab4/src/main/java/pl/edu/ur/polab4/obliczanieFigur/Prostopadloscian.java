/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author student
 */
public class Prostopadloscian implements FiguraPrzestrzenna {

    private double bokA;
    private double bokB;
    private double bokC;

    public Prostopadloscian(double bokA, double bokB, double bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    @Override
    public void obliczObjetosc() {
        System.out.println(this.bokA * this.bokB * this.bokC);
    }

}
