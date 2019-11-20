package org.launchcode.java.studios.resturantmenu;

import java.util.UUID;

public class MenuItem {
    //in the classes create the properties first.
    private final String id = UUID.randomUUID().toString();
    private String name;
    private String description;
    private double price;

    public MenuItem(
            String name,
            double price,
            String description
    ) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public MenuItem(
            String name,
            double price
    ) { this(name, price, "");
    }


    public String getId() {return id;}
    public String getName() {return name;}
    public void setName (String newName) {name = newName;}
    public String getDescription() {return description;}
    public void setDescription(String newDescription) {description = newDescription;}
    public double getPrice() {return price;}
    public void setPrice(double newPrice) {price = newPrice;}
}