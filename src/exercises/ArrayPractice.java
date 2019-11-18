package exercises;

import java.util.Arrays;

public class ArrayPractice {
    private static Object String;

    public static void main(String[] args) {
        //create an array with these numbers
        int [] someNums = {1, 1, 2, 3, 5, 8};
//        int oddNums = someNums[odd];
        //loop through the array to print the numbers
        for (int i : someNums) {
            System.out.println(i);
        } /*having trouble figuring out how to only print the odd numbers*/
        //loop through the array to only print the odd numbers

        String greenEggsAndHam = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String = greenEggsAndHam.split(",");
        System.out.println(Arrays.toString(new String[]{greenEggsAndHam}));;
        //having trouble with the string manipulations too :(


    }
}
