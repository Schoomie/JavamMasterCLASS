package lesson84;

/**
 * Created by Kuba on 07/03/2019.
 */
public class Reverse {

    public static int[] reverse(int[] arr) {
        int temp;
        int tablelength = arr.length - 1;
        for (int i = 0; i < (tablelength) / 2; i++) {
            temp = arr[i];
            arr[i] = arr[tablelength - i];
            arr[tablelength - i] = temp;
        }

        return arr;
    }
}
