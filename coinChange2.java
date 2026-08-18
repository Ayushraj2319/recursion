import java.util.*;
public class coinChange2 {
    static int solve(int[] coins,int amount,int index){
        if(amount==0) return 1;
        if(amount<0 || index==coins.length) return 0;
        int include=solve(coins,amount-coins[index],index);
        int exclude=solve(coins,amount,index+1);
         return include+exclude;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        int amount=sc.nextInt();
        int ans=solve(coins,amount,0);
        System.out.println(ans);
    }
}
