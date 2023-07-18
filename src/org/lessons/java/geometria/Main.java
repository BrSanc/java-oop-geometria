package org.lessons.java.geometria;
/*
       -Creare una classe Main contenente il metodo main(), nel quale chiedete all’utente di inserire, da console,
        i valori di base e di altezza con cui istanziare un nuovo Rettangolo.

       -Dopo averlo istanziato, stampate a video il perimetro e l’area.


        BONUS Aggiungere alla classe Rettangolo un metodo disegna() che stampa in console il rettangolo con le sue dimensioni, come nell’immagine allegata*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Base: ");
        int baseInput = scan.nextInt();
        System.out.println("Heigh: ");
        int heighInput = scan.nextInt();

        Rettangolo rettangolo = new Rettangolo(baseInput,heighInput);

        System.out.println("Base: " + baseInput + "cm");
        System.out.println("Heigh: " + heighInput + "cm");
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro() + "cm");
        System.out.println("Area: " + rettangolo.calcolaArea() + "cm²");





    }
}
