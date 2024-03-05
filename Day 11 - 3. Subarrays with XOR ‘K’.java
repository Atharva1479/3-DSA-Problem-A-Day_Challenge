//Strivers A2Z DSA Sheet

//Array - Hard

//Subarrays with XOR ‘K’

/* Problem statement
Given an array ‘A’ consisting of ‘N’ integers and an integer ‘B’, find the number of subarrays of array ‘A’ whose bitwise XOR( ⊕ ) of all elements is equal to ‘B’.

A subarray of an array is obtained by removing some(zero or more) elements from the front and back of the array.

Example:
Input: ‘N’ = 4 ‘B’ = 2
‘A’ = [1, 2, 3, 2]

Output: 3

Explanation: Subarrays have bitwise xor equal to ‘2’ are: [1, 2, 3, 2], [2], [2]. */

import java.util.HashMap;

public class Solution {
    public static int subarraysWithSumK(int[] a, int b) {
        int n = a.length;
        int xor = 0;
        int count = 0;
        int result = 0;

        // HashMap to store prefix XOR values and their counts
        HashMap<Integer, Integer> xorCount = new HashMap<>();
        xorCount.put(0, 1);

        for (int i = 0; i < n; i++) {
            xor ^= a[i];

            // Calculate the XOR value that needs to be found for a subarray
            int targetXOR = xor ^ b;

            // If the target XOR is found in the HashMap, add the count to the result
            if (xorCount.containsKey(targetXOR)) {
                count += xorCount.get(targetXOR);
            }

            // Update the count of current XOR value in the HashMap
            xorCount.put(xor, xorCount.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}
