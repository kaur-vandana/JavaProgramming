package com.kv.structuralprogramming;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String [] array = { "blue", "green", "red", "blue", "green", "red", "blue", "green", "red"};

        int length = array.length-1;

        int i=0;
        while(i<length) {
            for(int j=i+1; j<length; j++) {
                if(array[i].compareTo(array[j])>0) {
                    String temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;
                }
            }
            i++;
        }

        System.out.println(Arrays.toString(array));
    }
}
