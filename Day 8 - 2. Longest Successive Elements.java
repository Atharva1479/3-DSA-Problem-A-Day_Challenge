//Strivers A2Z DSA Sheet

//Array - Medium

//Longest Successive Elements

/* Problem statement
There is an integer array ‘A’ of size ‘N’.

A sequence is successive when the adjacent elements of the sequence have a difference of 1.

You must return the length of the longest successive sequence.

Note:
You can reorder the array to form a sequence. 
For example,

Input:
A = [5, 8, 3, 2, 1, 4], N = 6
Output:
5
Explanation: 
The resultant sequence can be 1, 2, 3, 4, 5.    
The length of the sequence is 5. */

import java.util.HashSet;

public class Solution {
    public static int longestSuccessiveElements(int[] a) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : a) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}
