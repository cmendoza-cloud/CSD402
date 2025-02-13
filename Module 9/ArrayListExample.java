package Module_9;

// Carmen Mendoza
// CSD 402 
// Program 1 

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList with at least 10 strings
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Peach");
        words.add("Elderberry");
        words.add("Mango");
        words.add("Grape");
        words.add("Honeydew");
        words.add("Kiwi");
        words.add("Lemon");

        // Printing elements using for-each loop
        System.out.println("ArrayList elements:");
        for (String word : words) {
            System.out.println(word);
        }

        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index of the element you want to see again (0-9): ");
        String userInput = scanner.next(); // Working with user string input

        try {
            // Autoboxing: Converting string to Integer automatically
            int index = Integer.parseInt(userInput);
            
            // Accessing the element
            System.out.println("Element at index " + index + ": " + words.get(index));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } finally {
            scanner.close();
        }
    }
}


