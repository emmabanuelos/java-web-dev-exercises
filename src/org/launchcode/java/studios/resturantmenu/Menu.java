package org.launchcode.java.studios.resturantmenu;

public class Menu {

    private String menuItem = "Cheeseburger";
    private double price;

    public void yummy() {
        System.out.println(menuItem);
    }



    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.yummy();
    }


}
