package no.hvl.dat100;

import java.util.Arrays;
import java.util.Scanner;

public class tabeller {

    public static void main(String[] args) {

        int[] tab1 = {7, 4, 9, 17, 3};
        int[] tab2 = {12, 5, 18, 7, 2};

        // Oppgave a (Skriver ut tabellen)
        skrivUt(tab1);

        // Oppgave b (
        tilStreng(tab1);

        // Oppgave c (Summerer)
        summer(tab1);

        // Oppgave d (sjekker om et tall finnes)
        finnesTall(tab1, 2);

        // Oppgave e (Returnerer første index)
        posisjonTall(tab1, tab1[0]);

        // Oppgave f (Reversering)
        reverser(tab1);

        // Oppgave g (Sortering)
        erSortert(tab1);

        // Oppgave h (
        settSammen(tab1, tab2);
}

     // Oppgave a
public static void skrivUt (int[] tabell) {

        for(int i = 0; i < tabell.length; i++) {
            System.out.println(tabell[i]);
        }
}

    // Oppgave b
public static String tilStreng (int[] tabell) {

        String tab = " ";
        for (int i = 0; i < tabell.length; i++) {
        }
        System.out.println("Dette er en streng representasjon av tab1: ");
        System.out.println(Arrays.toString(tabell));
        return tab;
}

     // Oppgave c
public static int summer (int[] tabell) {

        int sum = 0;
        for(int num : tabell) {
           sum = sum + num;
        }
        System.out.println("Summen av elementene i tabellen er : " + sum);
        return sum;
}

     // Oppgave d
public static boolean finnesTall (int[] tabell, int tall) {

        boolean funnet = false;
        int i = 0;
        boolean finnes = false;
        for(int element : tabell) {
            if (element == tall) {
                finnes = true;
                break;
            }
        }
        System.out.println("Er " + tall + " i tabellen? : " + finnes);

        return finnes;
}

     // Oppgave e
public static int posisjonTall (int[] tabell, int tall) {

        boolean funnetTall = false;
        int i = 0;
        do {
            if(tabell[i] == tall) {
                funnetTall = true;
            System.out.println("Returnerer første index i tabellen: " + tall);
            }

            i++;
        }while (i < tabell.length && funnetTall == false);
        if (funnetTall == false) {
            i = -1;
        }
        return i;
}

    // Oppgave f
    public static int[] reverser ( int[] tabell){

        for (int i = 0; i < tabell.length / 2; i++) {
            int temp = tabell[i];
            tabell[i] = tabell[tabell.length - i - 1];
            tabell[tabell.length - i - 1] = temp;
        }
        System.out.println("Tabellen etter reversering: " + Arrays.toString(tabell));

        return tabell;
}

    // Oppgave g 
public static boolean erSortert (int[] tabell) {

    int[] tabSorter = {7, 4, 9, 1, 10,};

    boolean sortert = true;
    int i = 1;
    while (sortert && i < tabell.length) {
        if (tabell[i - 1] <= tabell[i])
            i++;
        else
            sortert = false;
    }
    if (!sortert)
        Arrays.sort(tabell);

    System.out.println("Sortert tabell: " + Arrays.toString(tabell));

    return sortert;
}

public static int[]settSammen(int[] tabell1, int[] tabell2) {

        int nyLengde = tabell1.length + tabell2.length;
        int[] nyTab = new int[nyLengde];
        int pos = 0;

        for (int element : tabell1) {
            nyTab[pos] = element;
            pos++;
        }
        for (int element : tabell2) {
            nyTab[pos] = element;
            pos++;
        }
        System.out.println("Sammensetting av tab1 og tab2: ");
        System.out.println(Arrays.toString(nyTab)); 
        return nyTab;


}
}




