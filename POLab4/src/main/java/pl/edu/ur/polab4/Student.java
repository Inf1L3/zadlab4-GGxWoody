/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
public class Student {

    private String imie;
    private String nazwisko;
    private int nrIndexu;
    private String specjalizacja;
    private int rokStudiow;

    public Student(String imie, String nazwisko, int nrIndexu, String specjalizacja, int rokStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndexu = nrIndexu;
        this.specjalizacja = specjalizacja;
        this.rokStudiow = rokStudiow;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndexu = 0;
        this.specjalizacja = "";
        this.rokStudiow = 0;
    }

    public Student(String imie, String nazwisko, int nrIndexu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndexu = nrIndexu;
        this.specjalizacja = "";
        this.rokStudiow = 0;
    }

    public Student(String imie, String nazwisko, int nrIndexu, String specjalizacja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndexu = nrIndexu;
        this.specjalizacja = specjalizacja;
        this.rokStudiow = 0;
    }

    @Override
    public String toString() {
        return "Student{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", nrIndexu=" + nrIndexu + ", specjalizacja=" + specjalizacja + ", rokStudiow=" + rokStudiow + '}';
    }

}
