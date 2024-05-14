package homework;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_ArrayListIsEmptyOrNot {
    public static void main(String[] args) {
        //Calling static method in main method
        arrayList();
    }
    public static void arrayList() {
        //Declare the variable of array list
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println("Original array list : " + c1);//Print Original arraylist
        System.out.println("Checking arraylist is empty or not: " + c1.isEmpty());//Checking Arraylist is empty or not
        c1.removeAll(c1);
        System.out.println("Array List after remove all elements : " + c1);//print after removal of elemets
        System.out.println("Checking the above array list is empty or not: " + c1.isEmpty());//Checking Arraylist is empty or not


    }
}
