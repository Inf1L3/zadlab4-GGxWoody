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
public class Prostokat implements FiguraPlaska {

    private double bokA;
    private double bokB;
    
    public Prostokat(double bokA,double bokB){
        this.bokA = bokA;
        this.bokB = bokB;
    }
    @Override
    public void obliczPole() {
        System.out.println(this.bokA*this.bokB);
    }

    @Override
    public void obliczObwod() {
        System.out.println(this.bokA*2+this.bokB*2);
    }
    
}
