package com.epam.cdp.Module_3;

// making this class FINAL will pevent it from inheritance
public class FinalClassSample {
    public static void main(String[] args) {
        FinalClassSample childClass = new ChildClass();
            childClass.printSomething("Something");


    }
// making this method FINAL will prevent it from overriding
    public void printSomething(String message){
        System.out.println(message);
    }

}



class ChildClass extends FinalClassSample {
    @Override
    public void printSomething(String message){
        System.out.println(message + " was printed from child");
    }


}
