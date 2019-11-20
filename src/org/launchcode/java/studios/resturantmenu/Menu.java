package org.launchcode.java.studios.resturantmenu;

import java.util.ArrayList;
import java.util.UUID;

public class Menu {
    private final String id = UUID.randomUUID().toString();
    private String name;
    private ArrayList<MenuItem> items = new ArrayList<>();

    public Menu(String name) {this.name = name;}
    public String getId() {return id;}
    public String getName() {return name;}
    public void setName(String aName) {name = aName;}
    public void addItem(MenuItem aItem) {items.add(aItem);}

    public ArrayList<String> getItems () {
        ArrayList<String> items = new ArrayList<>();

        for (MenuItem item : this.items) {
            String lineItem = "";

            lineItem += item.getName() + "\t";
            lineItem += item.getDescription() + "\t";
            lineItem += item.getPrice();

            items.add(lineItem);
        }
        return items;
    }
//    private double price;

//    public void yummy() {
//        System.out.println(menuItem);
//    }
//
//
//
//    public static void main(String[] args) {
//        Menu menu = new Menu();
//
//        menu.yummy();
//    }


}
