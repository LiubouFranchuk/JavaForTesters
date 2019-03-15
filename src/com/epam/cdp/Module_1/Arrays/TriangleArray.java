package com.epam.cdp.Module_1.Arrays;

public class TriangleArray {
    public static void main (String[] args){
        int[][] triangleArray = new int[5][];
                triangleArray[0] = new int [1];
                triangleArray[1] = new int [2];
                triangleArray[2] = new int [3];
                triangleArray[3] = new int [4];
                triangleArray[4] = new int [5];

                for (int i = 0; i < triangleArray.length; i++){
                    for (int j = 0; j < triangleArray[i].length; j++){
                    System.out.print(triangleArray[i][j]);
                }
                System.out.println();
            }



    }
}
