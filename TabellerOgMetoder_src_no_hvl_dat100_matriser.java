package no.hvl.dat100;
import java.util.*;

public class matriser {

    public static void main(String[] args) {

        int[][] mat1 = { {1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9} };

        int[][] mat2 = { {9, 8, 7},
                         {6, 5, 4},
                         {3, 2, 1} };

        // Oppgave a
        skrivUtv1(mat1);

        // Oppgave b
        tilStreng(mat1);

        // Oppgave c
        skaler(10, mat1);

        // Oppgave d
        erLik(mat1, mat2);

        // Fikk ikke til å kjøre matrisene i main?


    }

        public static void skrivUtv1(int[][] matrise) {

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise.length; i++) {

                System.out.println(matrise[i][j]);
            }
        }
    }

    public static String tilStreng(int[][] matrise) {
        String mat = " ";
        for (int i = 0; i < matrise.length; i++) {
        }
        System.out.println("Dette er en streng representasjon av mat1: ");
        System.out.println(Arrays.toString(matrise));
        return mat;
    }

    public static int[][] skaler(int tall, int[][] matrise) {
            for (int i = 0; i < matrise.length; i ++) {
                for (int j = 0; j < matrise.length; j++) {
                    matrise[i][j] *= tall;
                }
            }
            System.out.println("Returnerer tall i matrisen " + matrise + " multiplisert med tall: " + tall);
        return matrise;
    }

    public static boolean erLik(int[][] mat1, int[][] mat2) {
        int row1, col1, row2, col2;
        boolean flag = true;

        row1 = mat1.length;
        col2 = mat1[0].length;

        row2 = mat2.length;
        col1 = mat2[0].length;

        if (row1 != row2 || col1 != col2) {
            System.out.println("Matrisene er ikke like");
        }
        else {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    if (mat1[i][j] != mat2[i][j]) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag)
                System.out.println("Matrisene er like");

            else
                System.out.println("Matrisene er ikke like");
        }
        return flag;
    }

    public static int[][] speile(int[][] matrise) {
        //Valgfri
        throw new UnsupportedOperationException("speile ikke implementert");
    }

    public static int[][] multipliser(int[][] a, int [][] b) {
        //Valgfri
        throw new UnsupportedOperationException("multipliser ikke implementert");
    }
}
