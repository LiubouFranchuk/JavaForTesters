package com.epam.cdp.Module_3;

public class ReversedString {
    public static void main(String[] args) {
        String text = "I am the best tester in EPAM";
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(String.valueOf(text.charAt(i)));
        }

//option 2
        String text2 = "I am the best tester in EPAM";
        StringBuffer sb = new StringBuffer();
        for (int i = text2.length() - 1; i >= 0; i--) {
            sb.append(text2.charAt(i));
        }
        System.out.println(sb.toString());


        //option 3
//        String string = "I am the best tester in EPAM";
//        System.out.println(reverseStringBuffer(string));
//
//        public static reverseStringBuffer(String s){
//            return new StringBuffer(s).reverse().toString();
//        }
//Module 3 - 01:46 webinar - idk what's worong in option 3

    }
}