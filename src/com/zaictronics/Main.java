package com.zaictronics;

public class Main {

    /**
     * @param args
     * Problem: Given an array, find the second smallest number?
     * Author: Ali Mulondo
     * Date:29/11/2021
     * assumptions:
     * 1) Array not sorted
     * 2) Array contains duplicates and negative integers
     */
    public static void main(String[] args) {

	// sample array
        int[] test = {9, 5, 2, -1,-1,1, 1, 4, 22, 6, 19};



        System.out.println(secondSmallest(test));
    }

    public static int secondSmallest(int[] arr){

        if(arr == null || arr.length < 2){
            throw new IllegalArgumentException("Array is to small");
        }

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for(int val:arr){
            if(val < smallest){
                secondsmallest = smallest;
                smallest = val;
            }
            else if(val > smallest && val < secondsmallest){
                secondsmallest = val;
            }

        }

        return secondsmallest;

    }
}
