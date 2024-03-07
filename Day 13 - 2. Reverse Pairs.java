//Strivers A2Z DSA Sheet

//Array - Hard

//Reverse Pairs

/* Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where:

0 <= i < j < nums.length and
nums[i] > 2 * nums[j].

Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1 */

public class Solution {

    public static int reversePairs(int[] nums) {
        
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }

    private static int mergeSortAndCount(int[] nums, int low, int high) {
        if (low >= high) {
            return 0;
        }

        int mid = low + (high - low) / 2;

        int count = mergeSortAndCount(nums, low, mid) + mergeSortAndCount(nums, mid + 1, high);

        count += merge(nums, low, mid, high);

        return count;
    }

    private static int merge(int[] nums, int low, int mid, int high) {
        int count = 0;

        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        // Count reverse pairs during the merge step
        while (i <= mid && j <= high) {
            if ((long) nums[i] > 2 * (long) nums[j]) {
                count += mid - i + 1;
                j++;
            } else {
                i++;
            }
        }

        // Merge the two sorted halves
        i = low;
        j = mid + 1;
        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // Copy the merged elements back to the original array
        System.arraycopy(temp, 0, nums, low, temp.length);

        return count;
    }
}
