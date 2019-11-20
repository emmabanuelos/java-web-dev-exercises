package org.launchcode.java.studios.resturantmenu;

public class Main {
    public static void main (String[] args) {
        Menu menu = new Menu("Emma' Place");

        menu.addItem(new MenuItem("Chicken Picatta", 10.00));
        menu.addItem(new MenuItem("Steak Fajitas", 15.00));

        System.out.println(menu.getName());
//        System.out.println(menu.getId());
        System.out.println(menu.getItems());
    }
}
