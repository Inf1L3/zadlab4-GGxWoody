package pl.edu.ur.polab4;

import java.util.Scanner;
import pl.edu.ur.polab4.obliczanieFigur.Kolo;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5

//        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj imie: ");
//        String imie = input.nextLine();
//        System.out.println("Podaj nazwisko: ");
//        String nazwisko = input.nextLine();
//        System.out.println("Podaj specjalizacje: ");
//        String specjalizacja = input.nextLine();
//        System.out.println("Podaj muner indexu: ");
//        int numerIndexu = input.nextInt();
//        input.nextLine();
//        System.out.println("Podaj rok studiow: ");
//        int rokStudiow =input.nextInt();
//        Student s1 = new Student(imie,nazwisko,numerIndexu,specjalizacja,rokStudiow);
//        System.out.println(s1.toString());
        Kolo k1 = new Kolo(5);
        k1.obliczObwod();
        k1.obliczPole();
    }

}
