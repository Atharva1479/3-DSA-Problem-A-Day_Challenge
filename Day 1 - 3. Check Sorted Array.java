//Array - Easy

//Check Sorted Array

/* 
Problem statement:
You have been given an array ‘a’ of ‘n’ non-negative integers.
You have to check whether the given array is sorted in the non-decreasing order or not.
Your task is to return 1 if the given array is sorted. Else, return 0.

Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: 1

The given array is sorted in non-decreasing order; hence the answer will be 1. */

import java.util.Scanner;

public class Solution {
    public static int isSorted(int n, int []a) {
        
        for(int i = 0; i < n-1; i++){

            if(a[i] > a[i+1]){

                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            
            a[i] = sc.nextInt();
        }
        System.out.println(isSorted(n, a));
    }
}