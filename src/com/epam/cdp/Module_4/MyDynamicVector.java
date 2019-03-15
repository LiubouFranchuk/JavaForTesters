package com.epam.cdp.Module_4;


public class MyDynamicVector<E> {

    private  Object[] data = new Object[3];
    private int size = 0;


    public int getSize() {
        return size;
    }

    public E getLast() {
        return (E) data[size-1];
    }

    public E get(int i) {
        return (E) data[i];
    }

    public void add(E e) {
        if (data.length <= size){
            Object [] tmp = data;
            data = new Object[size*2];
            for (int i = 0; i < tmp.length; i++) {
                data[i] = tmp[i];
            }
        }
        data[size] = e;
        size++;
    }


    public static void main(String[] args) {
        MyDynamicVector<String> vector = new MyDynamicVector();
        vector.add("1");
        vector.add("2");
        vector.add("15");
        vector.add("Selenium");

        System.out.println(vector.get(3));
        System.out.println(vector.getLast());
        System.out.println(vector.getSize());


        MyDynamicVector<Integer> vector2 = new MyDynamicVector();
        vector2.add(1);
        vector2.add(2);
        vector2.add(15);
        vector2.add(42);
        vector2.add(Integer.parseInt("42"));

        System.out.println(vector2.get(3));
        System.out.println(vector2.getLast());
        System.out.println(vector2.getSize());
    }


}
