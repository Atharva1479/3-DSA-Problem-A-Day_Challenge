//Strivers A2Z DSA Sheet

//Array - Easy

//Longest Subarray With Sum K

/* Problem statement:
You are given an array 'a' of size 'n' and an integer 'k'.

Find the length of the longest subarray of 'a' whose sum is equal to 'k'.

Example : 
Input: ‘n’ = 7 ‘k’ = 3
‘a’ = [1, 2, 3, 1, 1, 1, 1]
Output: 3
Explanation: Subarrays whose sum = ‘3’ are:
[1, 2], [3], [1, 1, 1] and [1, 1, 1]
Here, the length of the longest subarray is 3, which is our final answer. */

import java.util.*;

public class Solution {
    public static int longestSubarrayWithSumK(int[] a, long k) {
        
        int n = a.length; // size of the array.

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of the remaining part i.e. x-k:
            int rem = (int) (sum - k);  // Explicitly cast k to int

            // Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
}
