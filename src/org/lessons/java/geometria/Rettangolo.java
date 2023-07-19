package org.lessons.java.geometria;

/*Consegna: Nel progetto java-oop-geometria creare un package org.lessons.java.geometria, in cui inserire le classi:
una classe Rettangolo con due attributi interi: base e altezza. Aggiungere un opportuno costruttore con parametri.

Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.*/




public class Rettangolo {

    int base;
    int heigh;


    //-------------------------Costruttori----------------------

    Rettangolo(int base, int heigh){
        this.base = base;
        this.heigh = heigh;
    }

    Rettangolo(){
        base= 1;
        heigh= 1;
    }

    //---------------------------Metodi------------------------

    int calcolaArea(){
        int area = base * heigh;
        return area;
    }

    int calcolaPerimetro(){
        int perimetro = (base*2) + (heigh*2);
        return  perimetro;
    }

    void draw(char marker){
        for (int i = 0; i < base; i++) {
            System.out.print(marker);
        }
        System.out.println();

        for (int i = 0; i < heigh - 2; i++) {
            System.out.print(marker);
            for (int j = 0; j < base - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(marker);
        }

        for (int i = 0; i < base; i++) {
            System.out.print(marker);
        }
    }

}
