package homework;
/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;
import java.util.List;

public class Programme_4_NewArrayList {
    public static void main(String[] args) {

        //Calling static method in main method
        arraylist();
    }
    public static void arraylist() {
        List<String> Colours = new ArrayList<String>();
        Colours.add("Yellow");
        Colours.add("Red");
        Colours.add("Blue");
        Colours.add("White");
        Colours.add("Purple");

        //Print Arraylist using for loop
        for (String colours : Colours) {
            System.out.println(colours);
        }
    }

}