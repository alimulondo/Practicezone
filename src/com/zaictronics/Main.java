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
        int[] test = {9, 5, 2, -1, -1, 4, 1, 22, 6, 19};

        System.out.println(secondSmallest(test));
    }

    public static int secondSmallest(int[] arr){
        int smallest = arr[0];
        int secondsmallest = arr[1];

        for(int val:arr){
            if(val < smallest){
                smallest = val;
            }

        }

        for (int val: arr){
            if (val < secondsmallest && val > smallest){
                secondsmallest = val;
            }
        }

        return secondsmallest;

    }
}
