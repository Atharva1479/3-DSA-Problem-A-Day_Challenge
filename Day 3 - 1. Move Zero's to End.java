//Strivers A2Z DSA Sheet

//Array - Easy

//Move Zero's to End

/*
 * Problem statement:
 * Given an array 'arr' of 'n' non-negative integers, your task is to move all the zeros to the end of the array 
 * while keeping the non-zero elements at the start of the array in their original order. Return the modified array.
 * 
 * Example :
 * Input: ‘n’ = 5, ‘arr’ = [1, 2, 0, 0, 2, 3]
 * Output: [1, 2, 2, 3, 0, 0]
 * Explanation: Moved all the 0’s to the end of an array, and the rest of the elements retain the order at the start.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
        public static int[] moveZeros(int n, int []a) {
        
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

        if(a[i] != 0){

            arr.add(a[i]);
            }
        }

        int nz = arr.size();

        for(int i = 0; i < nz; i++){

            a[i] = arr.get(i);
        }

        for(int i = nz; i < n; i++){

            a[i] = 0;
        }

        return a;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++){

            a[i] = sc.nextInt();
        }

        System.out.println(moveZeros(n, a));
    }
}