package com.epam.cdp.Module_1;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello, testers");
	MyClass myClass = new MyClass();
	MyClass.myMethod();
       
    }
}

class MyClass {
    public static void myMethod() {
        System.out.println("Hello, I'm method");
    }
}