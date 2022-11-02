// Imri Tull
// Intermediate Programming 2150
// Chapter 5 Extra Credit Assignment Exercise 1
package BookReading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class BookCounter extends InputMismatchException {

    public static Scanner scan = new Scanner(System.in);
    public static FileWriter bookWriter;


    public static void main(String[] args) {


        // setting up a user inputted array to calculate the sum, the highest number, the lowest number, and average of 10 inputted numbers.
        Scanner consoleInput = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(" Please enter 10 books: ");
        for (int i = 0; i < 10; ++i) {
            arr[i] = scan.nextInt();
        }


        // setting them all equal to 0, so they are initialized in the array
        int sum = arr[0];
        int lowest = arr[0];
        int highest = arr[0];
        int average;


        for (int i = 1; i < 10; i++) {
            sum += arr[i];
            if (arr[i] < lowest)
                lowest = arr[i];
            if (arr[i] > highest)
                highest = arr[i];
        }

        average = sum / 10;

        try {
            bookWriter = new FileWriter("Book1");
            for (int i = 0; i < 10; i++) {
                if (i == 9)
                    bookWriter.write(arr[i] + "\n");
                else
                    bookWriter.write(arr[i] + ";");
            }
            bookWriter.write("The sum of the numbers is: " + sum + "\n");
            bookWriter.write("The lowest of the numbers is: " + lowest + "\n");
            bookWriter.write("The highest of the numbers is: " + highest + "\n");
            bookWriter.write("The average of the numbers is: " + average + "\n");
            bookWriter.close();
            System.out.println("Good Job, the program has successfully calculated the books, look for the newly created text file :) ");
        } catch (InputMismatchException | IOException e) {
            System.out.println("I think something isn't adding up correctly");
            consoleInput.nextInt();
        } finally {
            System.out.println("End here.");
        }
    }
}
