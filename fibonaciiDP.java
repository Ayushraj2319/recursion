import java.util.*;;

public class fibonaciiDP {
        static int calls = 0;
        static int[] dp;
    public static int solve(int n){
        
         if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        calls++;
        dp[n]= solve(n-1) + solve(n-2);
        return dp[n];
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dp=new int[n+1];

        for(int i = 1; i <= n; i++){
            System.out.print(solve(i) + " ");
        }

        System.out.println("\nTotal calls = " + calls);
    }
}
