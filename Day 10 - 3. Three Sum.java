//Strivers A2Z DSA Sheet

//Array - Hard

//Three Sum

/*
You are given an array ‘ARR’ containing ‘N’ integers.

Return all the unique triplets [ARR[i], ARR[j], ARR[k]] such that i != j, j != k and k != i and their sum is equal to zero.

Example:
Input: ‘N’ = 5 
'ARR' =  [-1, -1, 2, 0, 1] 

Output: 
-1 -1 2
-1 0 1

Explanation:
(-1 -1 +2) = (-1 +0 +1) = 0. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> triplet(int n, int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        // Sort the array
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            // Skip duplicate elements for i
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == 0) {
                    // Found a triplet with zero sum
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));

                    // Skip duplicate elements for j
                    while (j < k && arr[j] == arr[j + 1]) {
                        j++;
                    }

                    // Skip duplicate elements for k
                    while (j < k && arr[k] == arr[k - 1]) {
                        k--;
                    }

                    // Move the pointers
                    j++;
                    k--;
                } else if (sum < 0) {
                    // Sum is less than zero, increment j to increase the sum
                    j++;
                } else {
                    // Sum is greater than zero, decrement k to decrease the sum
                    k--;
                }
            }
        }
        return ans;
    }
}
