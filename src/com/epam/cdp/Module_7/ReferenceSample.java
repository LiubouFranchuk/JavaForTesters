package com.epam.cdp.Module_7;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class ReferenceSample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

//        SoftReference<List<Integer>> softList = new SoftReference<>(list);
        WeakReference<List<Integer>> softList = new WeakReference<>(list);

        System.out.println(list.size());
        System.out.println(softList.get().size());
        //soft reference requires get before the follwoing. Otherwise, null will be returned

        list = null;
        System.gc();
        try {
            Thread.yield();
        } catch (Exception e) {
        }
        System.out.println(softList.get().size());
    }
}
