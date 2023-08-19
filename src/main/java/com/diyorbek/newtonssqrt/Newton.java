package com.diyorbek.newtonssqrt;

import java.util.Scanner;

public class Newton {
    // Step:0 Inside I add Scanner with 2 variables
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double guess = scanner.nextDouble();
        double differenceNumber = 0.00001;

        double result = squareRoot(guess, differenceNumber);

        System.out.println("Square root of " + guess + " is " + result);
}

// Step 1: Create a function to return a sqrt of a number using Newton's method
// Step 2: Should create variable to store final new guess
// Step 3: Create a while loop to iterate until the guess is close enough and return it

    static double squareRoot(double guessNumber, double differenceNumber) {
        double guess = guessNumber;
        double difference = guessNumber;

        while (difference > differenceNumber) {

            double newGuess = (guess + guessNumber / guess) / 2;

            double newDifference = newGuess - guess;
            if (newDifference < 0) {
                newDifference = -newDifference;
            }
            difference = newDifference;
            guess = newGuess;
        }
        return roundToDecimalPlaces(guess, 1);
    }

    // Step 4 Additionally: Added a function to round the number to a certain number of decimal places because I cannot use Math.round()
    static double roundToDecimalPlaces(double value, int decimalPlaces) {
        double scale = 1.0;
        for (int i = 0; i < decimalPlaces; i++) {
            scale *= 10.0;
        }

        double scaledValue = value * scale;
        double integralPart = (int) scaledValue;
        double fractionalPart = scaledValue - integralPart;

        // This is just to handle negative value input
        if (value < 0) {
            return 0;
        }

        if (fractionalPart >= 0.5) {
            integralPart += 1.0;
        }

        return integralPart / scale;
    }
}
