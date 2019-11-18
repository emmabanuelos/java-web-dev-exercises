package org.launchcode.java.studios.countingcharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacter {

    public static void main(String[] args) {
        //make a string variable
        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there. ";

        //using a hashmap key will be the character and the value being the number of times you see that character.
        //step one make our hashmap
        HashMap<Character, Integer> counts = new HashMap<>();

        char[] charactersInString = text.toCharArray();
        //this helps us put everything into an array

        //for each character in the string
//        for(int i = 0; i <charactersInString.length; i++) this would work too but we will use a for each loop for this example instead
        for (char c : charactersInString)
            //if i have seen this characer before
            if (counts.containsKey(c)) {
                //add one to the count
                int newCount = counts.get(c) + 1; /*get the old value out*/
                counts.put(c, newCount); /* put the new value in*/

            } else { //if i havent seen this character
                //set count to 1
                counts.put(c, 1);
            }

        //display the output, print out the hashmap
        for (char c : counts.keySet()) {
            System.out.println(c + ":" + counts.get(c));
        }

    }
}






        //think of declaring variable and how many you might need, and can erase later if need be.
        //need an array for the string
        /* need to loop through array and used a for loop
        need to check if the key already exists, used an if statement then used an else statement if it was not in the array

         */


        //loop through the string one character at a time

        //store and/or update the count for a given character using
            //an appropriate data structure.
        //loop through the date structure to print the results
            //(one character and its count per line)














//        code from the previous studio. wanted to look at it too.
//        HashMap<String, Double> quote = new HashMap<>();
//        Scanner input = new Scanner(System.in);
//        String newStudent;
//
//        System.out.println("Enter your sentence here");
//
//
//        do {
//
//            System.out.print("Student: ");
//            newStudent = input.nextLine();
//
//            if (!newStudent.equals("")) {
//                System.out.print("Grade: ");
//                Double newGrade = input.nextDouble();
//                quote.put(newStudent, newGrade);
//
//                // Read in the newline before looping back
//                input.nextLine();
//            }
//
//        } while(!newStudent.equals(""));
//
//        // Print class roster
//        System.out.println("\nClass roster:");
//        double sum = 0.0;
//
//        for (Map.Entry<String, Double> student : quote.entrySet()) {
//            System.out.println(student.getKey() + " (" + student.getValue() + ")");
//            sum += student.getValue();
//        }
//
//        double avg = sum / quote.size();
//        System.out.println("Average grade: " + avg);
//    }


