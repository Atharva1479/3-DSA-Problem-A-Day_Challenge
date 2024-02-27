//Strivers A2Z DSA Sheet

//Array - Easy

//Find The Single Element

/* Problem statement:
You are given a sorted array 'arr' of positive integers of size 'n'.

It contains each number exactly twice except for one number, which occurs exactly once.

Find the number that occurs exactly once.

Example :
Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.
Output: 2
Explanation: 1, 3, and 4 occur exactly twice. 2 occurs exactly once. Hence the answer is 2. */

import java.util.Scanner;

public class Solution {
    public static int getSingleElement(int []arr){
        
        int result = 0;

        for(int i : arr){

            result ^= i;
        }

        return result;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){

            arr[i] = sc.nextInt();
        }

        System.out.println(getSingleElement(arr));
    }
}