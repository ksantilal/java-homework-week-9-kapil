package week_9_homework;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme4_ArrayListWithForEachLoop {

    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList();
        colours.add("Red");
        colours.add("Green");
        colours.add("Orange");
        colours.add("White");
        colours.add("Black");
        colours.add("Purple");

        //using foreach loop
        System.out.println("Iterating over ArrayList using for-each loop ");
        for (String list : colours) {
            System.out.println(list);
        }
    }
}


