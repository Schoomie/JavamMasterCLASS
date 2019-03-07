package lesson83;


import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many numbers, do you want to add to your array?: ");
        int count = scanner.nextInt();

        int[] array = readIntegers(count);
        System.out.println(findMin(array));


    }

    public static int[] readIntegers(int count) {

        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("add #" + i + " number:");
            arr[i] = scanner.nextInt();
        }
        return arr;


    }

    public static int findMin(int[] arr) {
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minVal > arr[i])
                minVal = arr[i];
        }

        return minVal;
    }


}
