package org.launchcode.java.demos.polymorphism;

public abstract class Animal {
    private String name;

    public Animal(String name) { this.name = name;}

    public String noice() {
        return "Hello";
    }

    public String sayHello(){
        return"Hello My name is " + this.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
