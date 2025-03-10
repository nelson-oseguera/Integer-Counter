package IntegerCounter;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class IntegerCounter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan;
        int number;
        int count = 0;
        final int PER_LINE = 5; // Format number of integers per line

        fileScan = new Scanner(new File("input.txt"));

        System.out.println("Integers found:");

        while (fileScan.hasNext()) {
            if (fileScan.hasNextInt()) {
                number = fileScan.nextInt();
                System.out.print(number + "\t"); // Print integers separated by tabs for formatting
                count++;

                // Print a newline every PER_LINE integers for formatting
                if (count % PER_LINE == 0) {
                    System.out.println();
                }
            } else {
                // Consume and skip non-integer tokens
                fileScan.next();
            }
        }

        System.out.println("\n\n" + count + " total integers found.");
    }
}


