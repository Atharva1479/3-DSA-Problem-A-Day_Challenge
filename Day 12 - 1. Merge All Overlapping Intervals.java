//Strivers A2Z DSA Sheet

//Array - Hard

//Merge All Overlapping Intervals

/* 
Ninja is playing with intervals. He has an array of intervals called ‘Arr’ having ‘N’ intervals.

However, he doesn’t like overlapping intervals. So you must help Ninja by merging all the overlapping intervals in ‘Arr’ and 
return an array of non-overlapping intervals.

Note:
Two intervals [L1, R1] and [L2, R2] such that L1 <= L2, are said to be overlapping if and only if L2 <= R1.
For example:
For ‘N’ = 4, and 
‘Arr’ = {{1, 3}, {2, 4}, {3, 5}, {6, 7}}
We can see that {1, 3} and {2, 4} overlap, so if we merge them, we get {1, 4}.
Now ‘Arr’ becomes: {{1, 4}, {3, 5}, {6, 7}}
Still, we observe that {1, 4} and {3, 5} overlap, hence we merge them into {1, 5}.
Hence, ‘Arr’ becomes {{1, 5}, {6, 7}}. */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        ArrayList<List<Integer>> list = new ArrayList<>();
        int s = 0;
        int m = 0;
        int e = 1;

        while (e < arr.length) {
            if (arr[m][1] >= arr[e][0]) {
                if (arr[m][1] >= arr[e][1]) {
                    e++;
                } else {
                    e++;
                    m = e - 1;
                }
            } else {
                list.add(Arrays.asList(arr[s][0], arr[m][1]));
                e++;
                m = e - 1;
                s = m;
            }
        }
        list.add(Arrays.asList(arr[s][0], arr[m][1]));

        return list;
    }
}
