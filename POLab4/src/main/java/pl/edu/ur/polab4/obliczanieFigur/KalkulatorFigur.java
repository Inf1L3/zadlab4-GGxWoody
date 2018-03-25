/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import java.util.Scanner;

/**
 *
 * @author Przemysław Paliński
 */
public class KalkulatorFigur {

    public static void MenuKalkulatora() {
        System.out.println("Wybierz figure która chcesz");
        Scanner input = new Scanner(System.in);
        boolean czyTypPoprawny = false;
        boolean czyFiguraPoprawna = false;
        int typFigury = 0;
        int figura = 0;
        FiguraPlaska figuraDoKalkulatora1;
        FiguraPrzestrzenna figuraDoKalkulatora2;
        System.out.println("Podaj typ figury");
        System.out.println("1.Plaska");
        System.out.println("2.Przestrzenna");
        do {
            input.nextLine();
            if (input.hasNextInt()) {
                typFigury = input.nextInt();
                if (typFigury > 0 && typFigury < 3) {
                    czyTypPoprawny = true;
                }
            }
        } while (!czyTypPoprawny);
        if (typFigury == 1) {
            System.out.println("Figury plaskie: ");
            System.out.println("1.Kwadrat");
            System.out.println("2.Prostokat");
            System.out.println("3.Kolo");
            do {
                input.nextLine();
                if (input.hasNextInt()) {
                    figura = input.nextInt();
                    if (figura > 0 && figura < 4) {
                        czyFiguraPoprawna = true;
                    }
                }
            } while (!czyFiguraPoprawna);
            switch (figura) {
                case 1:
                    System.out.println("Podaj rozmiar kwadratu");
                    figuraDoKalkulatora1 = new Kwadrat(input.nextDouble());
                    input.nextLine();
                    figuraDoKalkulatora1.obliczObwod();
                    figuraDoKalkulatora1.obliczPole();
                    break;
                case 2:
                    System.out.println("Podaj rozmiar prostokata");
                    double a = input.nextDouble();
                    input.nextLine();
                    double b = input.nextDouble();
                    input.nextLine();
                    figuraDoKalkulatora1 = new Prostokat(a, b);
                    figuraDoKalkulatora1.obliczObwod();
                    figuraDoKalkulatora1.obliczPole();
                    break;
                case 3:
                    System.out.println("Podaj rozmiar kola");
                    figuraDoKalkulatora1 = new Kolo(input.nextDouble());
                    input.nextLine();
                    figuraDoKalkulatora1.obliczObwod();
                    figuraDoKalkulatora1.obliczPole();
                    break;
                default:
                    System.out.println("Zly numer figury");
                    break;
            }
        } else if (typFigury == 2) {
            System.out.println("Figury plaskie: ");
            System.out.println("1.Szescian");
            System.out.println("2.Prostopadloscian");
            System.out.println("3.Kula");
            do {
                input.nextLine();
                if (input.hasNextInt()) {
                    figura = input.nextInt();
                    if (figura > 0 && figura < 4) {
                        czyFiguraPoprawna = true;
                    }
                }
            } while (!czyFiguraPoprawna);
            switch (figura) {
                case 1:
                    System.out.println("Podaj rozmiar szesciany");
                    figuraDoKalkulatora2 = new Szescian(input.nextDouble());
                    input.nextLine();
                    figuraDoKalkulatora2.obliczObjetosc();
                    break;
                case 2:
                    System.out.println("Podaj rozmiar prostopadloscianu");
                    double a = input.nextDouble();
                    input.nextLine();
                    double b = input.nextDouble();
                    input.nextLine();
                    double c = input.nextDouble();
                    input.nextLine();
                    figuraDoKalkulatora2 = new Prostopadloscian(a, b, c);
                    figuraDoKalkulatora2.obliczObjetosc();
                    break;
                case 3:
                    System.out.println("Podaj rozmiar kuli");
                    figuraDoKalkulatora2 = new Kula(input.nextDouble());
                    input.nextLine();
                    figuraDoKalkulatora2.obliczObjetosc();
                    break;
                default:
                    System.out.println("Zly numer figury");
                    break;
            }

        }
    }
}
