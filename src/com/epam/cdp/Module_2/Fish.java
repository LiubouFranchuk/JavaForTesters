package com.epam.cdp.Module_2;

public class Fish extends Animal {


    public Fish(String name) {
        super(name);
        this.height = 100;
        this.weight = 1;
    }

    @Override
    public void walk() {
        System.out.println("I'm not a walking fish, I float");

    }

    @Override
    public void eat() {
        this.weight = this.weight +2;

    }

    public void catchFish(){
        this.weight = 0;
        this.height = 0;
        fireFish();

    }

    private void fireFish(){
        System.out.println("I'm fired");
    }

}
