package com.epam.cdp.Module_7.reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefSample2 {
    public static void main(String[] args) {
        Class<?> animalClass = Animal.class;

        try {
            Object animal = animalClass.newInstance();
            System.out.println(animal.toString());


            Constructor<?> animalConstructor = animalClass.getConstructor(String.class);
            animal = animalConstructor.newInstance("Sharik");
            System.out.println(animal.toString());


            Field nameField = animalClass.getDeclaredField("name");
            nameField.setAccessible(true);
            //now private field "name" is made accessible so that we can change it from here.
            //this reminds SQL injections
            nameField.set(animal,"Murka");
            System.out.println(animal.toString());


            Method getter = animalClass.getDeclaredMethod("getName");
            System.out.println(getter.invoke(animal));
//            System.out.println(String.valueOf(getter.invoke(animal)));


            Method setter = animalClass.getDeclaredMethod("setName", String.class);
            setter.invoke(animal, "Burenka");
            System.out.println(getter.invoke(animal));






        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
