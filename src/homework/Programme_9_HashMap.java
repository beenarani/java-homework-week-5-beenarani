package homework;

import java.util.HashMap;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    public static void main(String[] args) {
        //create hashmap object call String people
        HashMap<String,Integer> people = new HashMap<String,Integer>();

        //Add keys and Values (Name,age)
        people.put("Beena", 30);
        people.put("Renee", 15);
        people.put("Archana", 35);

        for (String i : people.keySet()){
            System.out.println("Keys : " + i + "value:" + people.get(i));
        }
    }
}
