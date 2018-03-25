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
public class Kolo implements FiguraPlaska{
    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }
    
    @Override
    public void obliczPole() {
        System.out.println(Math.PI*Math.pow(this.promien, 2));
    }

    @Override
    public void obliczObwod() {
        System.out.println(2*Math.PI);
    }    
}
