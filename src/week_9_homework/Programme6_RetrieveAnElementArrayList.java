package week_9_homework;

import java.util.ArrayList;

/**
 * 6.Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme6_RetrieveAnElementArrayList {

    public static void main(String[] args) {
        // Create a new ArrayList and add some elements
        ArrayList<String> city = new ArrayList<>();
        city.add("Ahmedabad");
        city.add("Delhi");//add city name
        city.add("Mumbai");
        city.add("Banglore");
        city.add("Pune");

        // Specify the index from which to retrieve the element
        int indexToRetrieve = 2;

        // Check if the index is within the bounds of the ArrayList
        if (indexToRetrieve >= 0 && indexToRetrieve < city.size()) {
            String retrievedElement = city.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);
        } else {
            System.out.println("Index is out of bounds.");
        }
    }
}




