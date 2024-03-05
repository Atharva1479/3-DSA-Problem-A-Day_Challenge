//Strivers A2Z DSA Sheet

//Array - Hard

//Longest Subarray With Zero Sum

/* Problem statement
Ninja is given an array ‘Arr’ of size ‘N’. You have to help him find the longest subarray of ‘Arr’, whose sum is 0. You must return the length of the longest subarray whose sum is 0.



For Example:
For N = 5, and Arr = {1, -1, 0, 0, 1}, 
We have the following subarrays with zero sums: 
{{1, -1}, {1, -1, 0}, {1, -1, 0, 0}, {-1, 0, 0, 1}, {0}, {0, 0}, {0}}
Among these subarrays, {1, -1, 0, 0} and {-1, 0, 0, 1} are the longest subarrays with their sum equal to zero. Hence the answer is 4. */

import java.util.HashMap;

public class Solution {
    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        int n = arr.length;
        int maxLength = 0;
        int sum = 0;

        // Map to store the running sum and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Initialize the map with the sum 0 at index -1 (before the array starts)
        map.put(0, -1);

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // If the running sum is encountered again, calculate the length of the subarray
            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxLength = Math.max(maxLength, length);
            } else {
                // Store the running sum and its index in the map
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}
