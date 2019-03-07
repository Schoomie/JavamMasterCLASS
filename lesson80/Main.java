
package lesson80;

import java.util.Scanner;

public class Main {

    public static Scanner dawaj = new Scanner(System.in);

    public static void main(String[] args) {

        int[] tablica = pobierzLiczby(5);
        pokazTablice(tablica);
        sortujTablice(tablica);
        pokazTablice(tablica);


    }

    public static int[] pobierzLiczby(int ileLiczb) {
        int[] temp = new int[ileLiczb];
        System.out.println("podaj tyle liczb: " + ileLiczb);
        for (int i = 0; i < temp.length; i++) {
            System.out.println("podaj #" + (i + 1) + "liczbe : ");
            temp[i] = dawaj.nextInt();
        }
        return temp;
    }

    public static void pokazTablice(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }


    public static int[] sortujTablice(int[] tab) {


        int temp = 0;
        System.out.println("Posortowana Tablica: ");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < (tab.length - i); j++) {
                if (tab[j - 1] < tab[j]) {
                    temp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }

        return tab;
    }


}