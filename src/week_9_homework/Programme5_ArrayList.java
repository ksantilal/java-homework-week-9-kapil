package week_9_homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using Iterater.
 */
public class Programme5_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);
        System.out.println("ArrayList: " + numbers);

        Iterator<Integer> iterate = numbers.iterator();
        System.out.println("Iterating over ArrayList");
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}


