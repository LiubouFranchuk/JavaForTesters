/*
package com.epam.cdp.Module_5;

import java.io.*;

public class StreamsFromPresentation {
    public static void main(String[] args) {
        double[] prices = {10.0, 20.0, 30.0, 40.0, 50.0};
        int[] units = {1, 2, 3, 4, 5};
        String[] texts = {"A", "B", "C", "D", "E"};
        DataOutputStream out = null;
        try{
            out = new DataOutputStream(
                    new FileOutputStream ("/Users/mac/Desktop/newFoler/4.txt"));
            for (int i = 0; i < 5; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(texts[i]);
            }
        }
        finally {
            out.close();
        }


        DataInputStream in = null;
        double total = 0.0;
        try{
            in = new DataInputStream(
                    new FileInputStream("/Users/mac/Desktop/newFoler/4.txt"));
            try {
                while (true) {
                    double price = in.readDouble();
                    int unit = in.readInt();
                    String descritpion = in.readUTF();
                    total += unit * price;
                }
            }
            catch (EOFException e){
                    // exception is ignored
                }

            System.out.format("For a total of : $%.2f%n", total);
        }
        finally {
            in.close();
        }

    }
}
*/
