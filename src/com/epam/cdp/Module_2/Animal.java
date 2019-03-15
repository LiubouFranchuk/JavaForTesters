package com.epam.cdp.Module_2;

public abstract class Animal {

            protected int height;
            protected int weight;
            private String name;

    public Animal(int height, int weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public Animal (String name){
        this(10, 10, name);
    }

    public abstract void walk();
    public abstract void eat();
    public void talk(){
        System.out.println("My name is " + this.name + " weight " + this.weight + " height " + this.height);
    }
}




