package com.epam.cdp.Module_2;

public class CrazyZoo {
    public static void main (String[] args){
        Dog dog = new Dog ("Sharik");
//        dog.talk();
        Cat cat = new Cat (20, 50, "Murzik", "Kitikat");
//        cat.talk();
        Fish fish = new Fish("No_name");
//        fish.talk();
//        fish.catchFish();

        Animal[] crazyZoo = new Animal[3];
        crazyZoo[0] = cat;
        crazyZoo[1] = dog;
        crazyZoo[2] = fish;

        for (Animal animal: crazyZoo) {
            animal.talk();
            animal.walk();
            animal.eat();
            animal.talk();
            if (animal instanceof Smartable){
                ((Smartable)animal).think();
            }
            
        }

        Smartable[] smartZoo = new Smartable [2];
        smartZoo[0] = cat;
        smartZoo[1] = dog;
        for (Smartable smartable: smartZoo) {
            smartable.think();
        }

    }

}
