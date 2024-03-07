//Strivers A2Z DSA Sheet

//Array - Hard

//Number of Inversions

/* 
There is an integer array ‘A’ of size ‘N’.

Number of inversions in an array can be defined as the number of pairs of ‘i’, ‘j’ such that ‘i’ < ‘j’ and ‘A[i]’ > ‘A[j]’.

You must return the number of inversions in the array.

For example,
Input:
A = [5, 3, 2, 1, 4], N = 5
Output:
7
Explanation: 
The pairs satisfying the condition for inversion are (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), and (3, 4). 
The number of inversions in the array is 7. */

public class Solution {
    public static int numberOfInversions(int[] a, int n) {
        int[] temp = new int[n];
        return mergeSortAndCount(a, temp, 0, n - 1);
    }

    private static int mergeSortAndCount(int[] a, int[] temp, int low, int high) {
        int count = 0;

        if (low < high) {
            int mid = (low + high) / 2;

            // Recursively count inversions in the left and right halves
            count += mergeSortAndCount(a, temp, low, mid);
            count += mergeSortAndCount(a, temp, mid + 1, high);

            // Merge the two sorted halves and count inversions during merging
            count += mergeAndCount(a, temp, low, mid, high);
        }

        return count;
    }

    private static int mergeAndCount(int[] a, int[] temp, int low, int mid, int high) {
        int i = low, j = mid + 1, k = low;
        int count = 0;

        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                // Inversion found
                count += mid - i + 1;
                temp[k++] = a[j++];
            }
        }

        // Copy the remaining elements from the left subarray
        while (i <= mid) {
            temp[k++] = a[i++];
        }

        // Copy the remaining elements from the right subarray
        while (j <= high) {
            temp[k++] = a[j++];
        }

        // Copy the merged elements back to the original array
        System.arraycopy(temp, low, a, low, high - low + 1);

        return count;
    }
}
