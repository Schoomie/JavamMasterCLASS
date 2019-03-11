package test;

import java.util.ArrayList;

/**
 * Created by Kuba on 09/03/2019.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        //     items.add("tim");
        items.add(5);


        printDoubled(items);


    }


    private static void printDoubled(ArrayList<Integer> n) {
        for (Integer i : n) {
            System.out.println(i * 2);
        }
    }
}
