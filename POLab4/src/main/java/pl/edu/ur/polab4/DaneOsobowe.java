/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author Przemysław Paliński
 */
public class DaneOsobowe {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Jan", "Kowalski", 15);
        osoba1.pokazDane();
        
        System.out.println("---------------------");
        Osoba osoba2 = new Osoba("Adam", "Nowak");
        osoba2.pokazDane();
        
        System.out.println("---------------------");
        osoba2.imie = "Stefan";
        osoba2.wiek = 70;
        osoba2.pokazDane();
        
        System.out.println("---------------------");
        Osoba osoba3 = new Osoba();
        osoba3.imie = "Anna";
        osoba3.nazwisko = "Wiśniewska";
        osoba3.wiek = 45;
        osoba3.pokazDane();
        
    }
}
