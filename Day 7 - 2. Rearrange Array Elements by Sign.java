//Strivers A2Z DSA Sheet

//Array - Easy

//Rearrange Array Elements by Sign

/* You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

Example 1:
Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  

Example 2:
Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].*/

import java.util.Arrays;

public class Solution {
    
    public int[] rearrangeArray(int[] nums) {
        // Calculate the length of the input array
        int n = nums.length;

        // Initialize a result array with placeholders for rearranged elements
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        // Initialize indices for positive and negative elements in the result array
        int posind = 0;
        int negind = 1;

        // Iterate through the input nums
        for (int i : nums) {
            // If the number is positive, place it at the even index in the result array
            if (i > 0) {
                ans[posind] = i;
                posind += 2;
            }
            // If the number is negative, place it at the odd index in the result array
            else {
                ans[negind] = i;
                negind += 2;
            }
        }

        // Return the rearranged result array
        return ans;
    }
}