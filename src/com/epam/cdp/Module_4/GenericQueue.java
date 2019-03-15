package com.epam.cdp.Module_4;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("element 1");
        queue.add("element 2");
        queue.add("element 3");

        System.out.println(queue.peek());

//throw exception -> add, element, remove
//don't throw exception -> offer, pick, poll
//u'd better don't mix these methods up  like above
    }
}
