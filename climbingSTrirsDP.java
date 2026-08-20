import java.util.*;
class Solution {
    //Tabulation method 
    public static int climbStairs(int n) {

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbStairs(n));
    }
}
//Memoization method
// static int climbStairs(int n){
//     if(dp[n]!=0) return dp[n];
//     if(n<=1){
//         return 1;
//     }
//     dp[n]=solve(n-1)+solve(n-2);
//     return dp[n];
// }