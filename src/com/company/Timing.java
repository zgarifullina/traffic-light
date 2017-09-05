package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class is designed for accepting the correct timing input from user (in minutes)
 * for use in class TrafficLight methods.
 * @author Zulfia Garifullina
 * @since 01.09.2017.
 */
class Timing {

    /**
     * This method accepts user input for the number of minutes since the traffic light started working (double)
     * @return the number of minutes passed since the traffic light started working (>0)
     * @exception InputMismatchException On input mismatch
     * @exception NumberFormatException On negative number input
     */
    double getTiming() {
        Scanner scanner = new Scanner(System.in);
        double minute;
        while (true) {
            System.out.println("Enter the time of traffic light working in minutes (or 0 to quit)");
            try {
                minute = scanner.nextDouble();
                if (minute < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.err.println("Input invalid. Please try again.");
            }
            scanner.nextLine();
        }
        return minute;
    }
}
