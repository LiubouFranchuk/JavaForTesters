package com.epam.cdp.Module_7.reflect;

public class RefSample1 {
    public static void main(String[] args) {
        Class<?> animalClass = Animal.class;
        System.out.println(animalClass);

        System.out.println(animalClass.getSuperclass().getCanonicalName());

        Class<?>[] interfaces = animalClass.getInterfaces();
        for (Class<?> inter : interfaces){
            System.out.println(inter);
            System.out.println(inter.getCanonicalName());
        }


    }
}
