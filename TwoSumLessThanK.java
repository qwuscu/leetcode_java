/**
Given an array A of integers and integer K, return the maximum S such that there exists i < j with A[i] + A[j] = S and S < K. If no i, jexist satisfying this equation, return -1.

Example 1:

Input: A = [34,23,1,24,75,33,54,8], K = 60 Output: 58 Explanation: We can use 34 and 24 to sum 58 which is less than 60.
Example 2:

Input: A = [10,20,30], K = 15 Output: -1 Explanation: In this case it‘s not possible to get a pair sum less that 15.
Note:

1 <= A.length <= 100
1 <= A[i] <= 1000
1 <= K <= 2000
*/

/**
Sort the array. Use two pointers pointing at head and tail. Calculate the sum.

If sum < K, update res and l++ to increase sum.

Otherwise, r-- to decrease sum.

Time Complexity: O(nlogn). n = A.length.

Space: O(1).
*/

import java.util.Arrays;

public class TwoSumLessThanK{
    public static void main(String [] args) {
        int[] A = {34,23,1,24,75,33,54,8};
        int K = 60;
        System.out.println(new TwoSumLessThanK().twoSumLessThanK(A, K));
    }

    public int twoSumLessThanK(int[] A, int K){
        int res = -1;
        if (A == null || A.length == 0)
            return res;

        Arrays.sort(A);
        int i = 0;
        int j = A.length - 1;
        while (i < j){
            if (A[i] + A[j] >= K)
                j--;
            else
                res = Math.max(res, A[i] + A[j]);
                i++;
        }
        return res;
    }
}
