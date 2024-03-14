//Q1.

import java.util.Scanner;

public class q3_5 {
    public static void main(String[] args) {
        // Define the number of stocks and time intervals
        int numStocks = 3; // Change this to the desired number of stocks
        int numIntervals = 3; // Change this to the desired number of intervals

        // Create a 2D array to store the stock data (time and value)
        double[][] stockData = new double[numStocks][numIntervals];

        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input stock data
        for (int i = 0; i < numIntervals; i++) {
            System.out.println("Enter data for interval " + (i + 1) + ":");
            for (int j = 0; j < numStocks; j++) {
                System.out.print("Enter value for stock " + (j + 1) + ": ");
                stockData[j][i] = scanner.nextDouble();
            }
        }

        // Print stock values at respective time intervals
        for (int i = 0; i < numIntervals; i++) {
            System.out.println("\nValues at interval " + (i + 1) + ":");
            for (int j = 0; j < numStocks; j++) {
                System.out.println("Stock " + (j + 1) + ": " + stockData[j][i]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}