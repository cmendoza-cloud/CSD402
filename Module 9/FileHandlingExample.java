package Module_9;

// Carmen Mendoza 
// CSD 402 
// Program 2 

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) {
        String filename = "data.file";
        Random random = new Random();

        // Writing or appending to the file
        try (FileWriter fw = new FileWriter(filename, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            System.out.print("Writing numbers to file: ");
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(100); // Generating random numbers 0-99
                out.print(num + " ");
                System.out.print(num + " ");
            }
            System.out.println("\nNumbers written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        // Reading the file and displaying its contents
        System.out.println("\nReading numbers from file:");
        try (Scanner fileReader = new Scanner(new File(filename))) {
            while (fileReader.hasNextInt()) {
                System.out.print(fileReader.nextInt() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
