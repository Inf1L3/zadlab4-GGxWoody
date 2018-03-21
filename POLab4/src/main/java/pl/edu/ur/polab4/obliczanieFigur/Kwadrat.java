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
public class Kwadrat implements FiguraPlaska {

    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public void obliczPole() {
        System.out.println(Math.pow(bok, 2));
    }

    @Override
    public void obliczObwod() {
        System.out.println(this.bok * 4);
    }
}
