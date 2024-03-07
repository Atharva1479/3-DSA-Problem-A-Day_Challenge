//Strivers A2Z DSA Sheet

//Array - Hard

//Missing And Repeating Numbers

/* 
You are given an array of ‘N’ integers where each integer value is between ‘1’ and ‘N’.

Each integer appears exactly once except for ‘P’, which appears exactly twice, and ‘Q’, which is missing.

Your task is to find ‘P’ and ‘Q’ and return them respectively.

Example:
Input: ‘N’ = 4
‘A’ = [1, 2, 3, 2]

Output: {2, 4}

Explanation: The integer appearing twice is ‘2’, and the integer missing is ‘4’. */

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int[] findMissingRepeatingNumbers(int[] a) {
         int n = a.length; // size of the array
        int[] hash = new int[n + 1]; // hash array

        //update the hash array:
        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }

        //Find the repeating and missing number:
        int repeating = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) repeating = i;
            else if (hash[i] == 0) missing = i;

            if (repeating != -1 && missing != -1)
                break;
        }
        int[] ans = {repeating, missing};
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();

        // Input elements of the array
        int[] A = new int[N];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        scanner.close();

        // Find repeating and missing numbers
        int[] result = findMissingRepeatingNumbers(A);

        // Output the result
        System.out.println("Repeating number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }
}
