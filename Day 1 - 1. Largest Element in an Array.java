//Strivers A2Z DSA Sheet

//Array - Easy

//Largest Element in an Array

/*
Problem statement:
Given an array ‘arr’ of size ‘n’ find the largest element in the array.

Example:
Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
Output: 5

Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5. */

import java.util.Scanner;

public class Solution {

    static int largestElement(int[] arr, int n) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (max < arr[i]) {

                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println(largestElement(arr, n));
    }
}
