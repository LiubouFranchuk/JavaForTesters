package com.epam.cdp.Module_3;

public class ErrorApp1 {
    public static void main(String[] args) {
//        try{
//            return;
//        } finally{
//            System.out.println("finally");
//        }


        //try #2
        try{
            System.exit(42);
        } finally{
            System.out.println("finally");
        }

    }
}
