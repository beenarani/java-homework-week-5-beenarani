package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */
public class Programme_5_Iterator {
    public static void main(String[] args) {
        iteratorColour();
    }

    public static void iteratorColour() {
        // Create a list and add some colors to the list
        List<String> colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Orange");
        colours.add("White");
        colours.add("Black");

        //Get iterator
        Iterator<String> it = colours.iterator();
        System.out.println(colours);

    }
}


