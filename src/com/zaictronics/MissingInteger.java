package com.zaictronics;

import java.util.*;

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

        int[] sample = {4, 1};

        List<Integer> elements = multipleMissingNumb(sample, 5);
        System.out.println(elements);

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

    /*
    * find multiple missing elements using BitSet data structure
    * assuming no duplicate elements available
    * works for both sorted and unsorted array
    * */
    public static List<Integer> multipleMissingNumb(int[] arr, int size){
        int missingelements = size - arr.length;
        int nextmiss = 0;
        List<Integer> elements = new ArrayList<>();
        BitSet bitset = new BitSet(size);

        for (int val : arr){
            bitset.set(val -1);
        }

        for(int i=0; i < missingelements; i++){
            nextmiss = bitset.nextClearBit(nextmiss);
            nextmiss +=1;
            elements.add(nextmiss);
        }

        return elements;
    }
}
