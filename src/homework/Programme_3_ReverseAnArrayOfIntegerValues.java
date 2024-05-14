package homework;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Programme_3_ReverseAnArrayOfIntegerValues {

    public static void main(String[] args) {
        intergerValue();
    }

    public static void intergerValue() {
        //Declare the integer arrays
        int[] arrays = {1300, 895, 1505, 1703, 1135, 1236, 818, 306, 2015, 1013};
        //print the original array
        System.out.println("Original array : " + Arrays.toString(arrays));

        // Iterate through the first half of the array and reverse its elements.
        int i;
        for (i = 0; i < arrays.length / 2; i++) {
            int temp = arrays[i];
            arrays[i] = arrays[arrays.length - i - 1];
            arrays[arrays.length - i - 1] = temp;

        }
        // Print the reversed array
        System.out.println("Reverse array : " + Arrays.toString(arrays));

    }
}
