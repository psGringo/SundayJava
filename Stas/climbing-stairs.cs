// https://leetcode.com/problems/climbing-stairs/description/

public class Solution {
    public int ClimbStairs(int n) {

       if (n == 0)
         return 1;

       return n > 1 ? ClimbStairs(n - 1) + ClimbStairs(n -2) : n;
    }
}