package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double area;
        double radius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();

//        area = 3.14 * radius * radius;
       Circle.getArea(3.14);
        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(3.14));
    }
}
