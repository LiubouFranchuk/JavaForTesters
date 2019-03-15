package com.epam.cdp.Module_3;

public class StringDemo2 {
    public static void main(String[] args) {
        String cat1 = "Cat";
        String cat2 = "Cat";
        String cat3 = new String("Cat");
        String cat4 = cat3.intern();
//these methods of initioalization are all the same

        //sout --> abbreviation of the string below

   /*     System.out.println(cat1 == cat2);
        System.out.println(cat1 == cat3);
        True, False*/


        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
        System.out.println(cat1.equals(cat4));
//        True, True, True


        StringBuffer sb = new StringBuffer("Privet");
        for (int i=0; i<100; i++) {
            sb.append(i);

            // sb.apend(i) IS THE SAME AS sb+=i if sb were a string instaed of a StringBuffer
            //StringBuffer updates the value without creating a new string variable each time

        }
        System.out.println(sb.toString());

    }
}
