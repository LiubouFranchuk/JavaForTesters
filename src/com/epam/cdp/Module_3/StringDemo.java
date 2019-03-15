package com.epam.cdp.Module_3;

public class StringDemo {
    public static void main(String[] args) {
        String cat1 = "Cat";
        String cat2 = new String("Cat");
        String newString = String.valueOf(cat1.charAt(0)) + String.valueOf(cat2.charAt(1)) + cat1.charAt(2);
        //cat1 has already been coverted to String tvariable type, doesn't need to do it again
        System.out.println(newString);

        if(newString.endsWith("t")){
            System.out.println("Hurray!");
        }

        System.out.println(newString.indexOf("t"));

    }
}
