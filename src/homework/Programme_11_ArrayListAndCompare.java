package homework;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11_ArrayListAndCompare {
    public static void main(String[] args) {
        arrayCompare();
    }

    public static void arrayCompare() {
        ArrayList<String> c1 = new ArrayList<String>();
        ArrayList<String> c2 = new ArrayList<String>();

        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        if (c1.equals(c2)) {
            System.out.println("Arraylist are equals");
        } else {
            System.out.println("Arraylist are not equal");
        }


    }
}