package com.epam.cdp.Module_7.reflect;


import com.epam.cdp.Module_7.annitations.LiveAnimal;
import com.epam.cdp.Module_7.annitations.NotEmpty;

import java.io.Serializable;



class AbstractAnimal {}

@LiveAnimal
//    @NotEmpty
public class Animal extends AbstractAnimal implements Serializable {
    public String getName() {
        return name;
    }

//    @NotEmpty
    public void setName(String name) {
        this.name = name;
    }
    @NotEmpty
    private String name = "Barbos";

    public Animal(String name) {
        this.name = name;
    }

    public Animal(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
