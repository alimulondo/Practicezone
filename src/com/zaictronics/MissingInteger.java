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

        int[] sample = {1, 2, 4, 5};


        System.out.println(singleMissingElement(sample, sample.length + 1));

    }

    // use the series n(n + 1)/2 for n is the size of the array.
    public static int singleMissingElement(int[] arr, int count){

        int expectedSum = count*(count + 1)/2;

        int realSum = 0;
        for (int val : arr){
            realSum +=val;
        }

        return expectedSum - realSum;

    }
}
