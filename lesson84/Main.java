package lesson84;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 3, 5, 6, 7, 8, 9, 10};


        System.out.println("Array: " + (Arrays.toString(array)));
        Reverse.reverse(array);

        System.out.println("Reversed Array: " + (Arrays.toString(array)));

    }

}
