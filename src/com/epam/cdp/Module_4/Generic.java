package com.epam.cdp.Module_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generic {
    public static void main(String[] args) {

    }
//generic class
    public class Box<T>{
        private T t; // T stands for type
        public void set(T t){
            this.t = t;
        }
        public T get(){
            return t;
        }
    }
    Box<Integer>  integerBox = new Box<Integer>();


//generic method
    public static <T> T addAndReturn(T element, Collection<T> collection){
        collection.add(element);
        return(element);
    }
    Integer integerElement = new Integer(123);
    List<Integer> integerList = new ArrayList<Integer>();
    Integer theElement = addAndReturn(integerElement, integerList);
}
