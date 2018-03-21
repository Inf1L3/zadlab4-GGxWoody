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
public class Osoba {

    /* ------
     * Fields
     * ------ */
    public String imie;      //
    public String nazwisko;  // Pola klasy osoba
    public int wiek;         //

    /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
    // Konstruktor pierwszy
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    // Konstruktor drugi
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    // Konstruktor trzeci
    public Osoba() {
    }

    /* -------
     * Methods
     * ------- */
    //Metoda pokazująca dane osoby
    public void pokazDane() {
        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("wiek: " + this.wiek + " lat");
    }
}
