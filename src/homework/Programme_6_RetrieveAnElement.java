package homework;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveAnElement {
    public static void main(String[] args) {
        colourRetrieve();
    }
    public static void colourRetrieve() {
        // Create a list and add some colors to the list
        List<String> Color = new ArrayList<String>();
        Color.add("Red");
        Color.add("Green");
        Color.add("Orange");
        Color.add("White");
        Color.add("Black");
        // Print the list
        System.out.println(Color);
        // Retrieve the first and third element
        String element = Color.get(1);
        System.out.println("First element: " + element);
        element = Color.get(4);
        System.out.println("Third element: " + element);
    }
}


