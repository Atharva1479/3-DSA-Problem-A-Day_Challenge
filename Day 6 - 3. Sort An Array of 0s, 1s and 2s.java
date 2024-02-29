//Strivers A2Z DSA Sheet

//Array - Easy

//Sort An Array of 0s, 1s and 2s

/*
You have been given an array/list 'arr' consisting of 'n' elements.

Each element in the array is either 0, 1 or 2.

Sort this array/list in increasing order.

Do not make a new array/list. Make changes in the given array/list.

Example :
Input: 'arr' = [2, 2, 2, 2, 0, 0, 1, 0]
Output: Final 'arr' = [0, 0, 0, 1, 2, 2, 2, 2]
Explanation: The array is sorted in increasing order.
*/

import java.util.*;

public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {

        int count0 = 0, count1 = 0, count2 = 0;

        // Count the occurrences of 0s, 1s, and 2s
        for (int num : arr) {
            switch (num) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }

        // Overwrite the array with sorted values
        int i = 0;

        // Write 0s
        while (count0 > 0) {
            arr.set(i++, 0);
            count0--;
        }

        // Write 1s
        while (count1 > 0) {
            arr.set(i++, 1);
            count1--;
        }

        // Write 2s
        while (count2 > 0) {
            arr.set(i++, 2);
            count2--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter the elements (0, 1, or 2): ");
        for (int i = 0; i < size; i++) {
            arr.add(scanner.nextInt());
        }

        sortArray(arr, size);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
