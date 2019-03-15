package com.epam.cdp.Module_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RefernceCounting {
    private static List<Object> heap;

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();

        heap = new ArrayList<>();
        allocateObjects();
        System.out.println(heap.size() + " " + rt.freeMemory());
        allocateObjects();
        System.out.println(heap.size() + " " + rt.freeMemory());
        collectGarbage();
        System.gc();
        System.out.println(heap.size() + " " + rt.freeMemory());
        freeMemory();
        System.gc();
        System.out.println(heap.size() + " " + rt.freeMemory());

    }

    private static void allocateObjects() {
        for (int i = 0; i <10 ; i++) {
            heap.add(new byte[1024*1024]);

        }
    }

    private static void collectGarbage(){

        int start = heap.size()-1;
        int end = start-10;
        for (int i = start; (i >=0) && (i>end) ; i--) {
            heap.remove(i);
            
        }

    }

    private static void freeMemory(){
        heap.clear();

    }
}
