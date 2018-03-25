/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;
import pl.edu.ur.polab4.Student;

/**
 *
 * @author Przemysław Paliński
 */
public class TablicaStudentow {

    Student[] tablicaStudentow = new Student[100];

    public TablicaStudentow() {
        for (int i = 0; i < 100; i++) {
            tablicaStudentow[i] = new Student("", "");
        }
    }

    public void DodajLubNadpiszStudentaNaIndex(int index) {
        Scanner input = new Scanner(System.in);
        String imie = input.nextLine();
        String nazwisko = input.nextLine();
        String specjalizacja = input.nextLine();
        int nrIndexu = input.nextInt();
        input.nextLine();
        int rokStudiow = input.nextInt();
        Student dodajStudenta = new Student(imie, nazwisko, nrIndexu, specjalizacja, rokStudiow);
        this.tablicaStudentow[index] = dodajStudenta;
    }

    public void WyczyscStudentaNaIndex(int index) {
        Student usunStudenta = new Student("", "");
        this.tablicaStudentow[index] = usunStudenta;
    }

    public void WypiszStudentaNaIndex(int index) {
        System.out.println(this.tablicaStudentow[index].toString());
    }

    public void WypiszWszystkichStudentow() {
        for (Student uczen : this.tablicaStudentow) {
            System.out.println(uczen.toString());
        }
    }

    public void StudentowOdDoIndex(int startIndex, int stopIndex) {
        if (startIndex < stopIndex) {
            for (int i = startIndex; i < stopIndex; i++) {
                System.out.println(i+"."+this.tablicaStudentow[i].toString());
            }
        }else{
            System.out.println("Niepoprawne indexy start i stop");
        }

    }
}
