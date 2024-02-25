//Strivers A2Z DSA Sheet

//Array - Easy

//Remove Duplicates from Sorted Array

/*Problem statement:
You are given a sorted integer array 'arr' of size 'n'.
You need to remove the duplicates from the array such that each element appears only once.
Return the length of this new array.

Note:Do not allocate extra space for another array. You need to do this by modifying the given input array in place with O(1) extra memory. 

For example:
'n' = 5, 'arr' = [1 2 2 2 3].
The new array will be [1 2 3].
So our answer is 3. */

import java.util.Scanner;

public class Solution {
    public static int removeDuplicates(int[] arr, int n) {

        if (arr.length == 0) {

            return 0;
        }

        int k = 1;
        for (int i = 1; i < n; i++) {

            if (arr[i] != arr[i - 1]) {

                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();
        }

        int newLength = removeDuplicates(arr, n);
     
        System.out.println(newLength);
    }
}
