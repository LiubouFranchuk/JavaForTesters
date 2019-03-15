package com.epam.cdp.Module_7.reflect;

import java.lang.annotation.Annotation;

public class RefWithAnnotationsSample {
    public static void main(String[] args) {
        Class<?> animalClass = Animal.class;
//        Annotation[] annos = animalClass.getDeclaredAnnotations();
        Annotation[] annos = animalClass.getAnnotations();
        for (Annotation ann : annos) {
            System.out.println(ann.toString());
        }
    }
}
//no annotations printed - bug in code - not resolved yet