package com.zaictronics;

import java.util.Arrays;
import java.util.Random;

/**
 * Author: Ali Mulondo
 * Date: 30/11/2021
 * Question: How do you find the missing number in a given integer array of 1 to 100?
 * Assumptions:
 * 1) Array is not sorted
 * 2) Array contains only positive integers.
 * 3) Array contains 100 elements.
 */

public class MissingInteger {

    public static void main(String[] args){
        int[] test = new int[100];
         //generate an array with 100 elements and on random missing number.
        Random rand = new Random();
        int min = 1;
        int max = 100;

        int randval = min + rand.nextInt(max - min);

        int counter =1;
        for(int i = 0; i < 100; i++ ){

                test[i] = counter;
                counter++;

        }

        //add a random number into the array at a random position for testing
            test[randval]=randval;

        //Build a string from the array to print out the generated array.
           String str = "";
           for (int val: test){
               str = str +","+val;
           }

        System.out.println(findMissingInteger(test));
        System.out.println(str);

    }

    public static int findMissingInteger(int[] arr){

        if(arr == null || arr.length < 100){
            throw  new IllegalArgumentException("Array does not satisfy the problem");
        }

        Arrays.sort(arr);
        int counter = 1;
        int missing = Integer.MAX_VALUE;

        for (int val:arr){
            if(val != counter){
                missing = counter;
            }
            counter++;
        }


        return  missing;
    }
}
