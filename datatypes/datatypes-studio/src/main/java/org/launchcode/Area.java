package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        double inputRadius = input.nextDouble();
        double trueRadius = inputRadius * inputRadius * 3.14;
        System.out.println("The area of a circle of radius " + inputRadius +": " + trueRadius);
    }
}
