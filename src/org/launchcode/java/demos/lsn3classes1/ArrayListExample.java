package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListExample {
    public static void main(String [] args) {

        HashMap<String, String> menuItem1 = new HashMap<>();
        menuItem1.put("id", "1");
        menuItem1.put("name", "Tomato Soup");
        menuItem1.put("description", "Soup made from tomatoes");

        HashMap<String, String> menuItem2 = new HashMap<>();
        menuItem2.put("id", "2");
        menuItem2.put("name", "Grilled Cheese Sandwich");
        menuItem2.put("description", "American cheese sandwich");

        HashMap<String, String> menuItem3 = new HashMap<>();
        menuItem3.put("id", "3");
        menuItem3.put("name", "Caesar Salad");
        menuItem3.put("description", "Caesar salad with croutons");

        ArrayList<HashMap<String, String>> hashMapArrayList = new ArrayList<>();
        hashMapArrayList.add(menuItem1);
        hashMapArrayList.add(menuItem2);
        hashMapArrayList.add(menuItem3);

        //print arraylist
        for(HashMap<String, String> menuItem: hashMapArrayList) {
            System.out.println("****");
            for (Map.Entry<String, String> menuItemEntry : menuItem.entrySet()) {
                System.out.println(menuItemEntry.getKey() + ": " + menuItemEntry.getValue());
            }
            System.out.println("****");
        }
    }
}
// Created by shivanykshenoy and forked by emma "https://gist.github.com/emmabanuelos/879fbca20e69fd687f6bf9a672e8ffd6.js"
