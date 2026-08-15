import java.util.*;
public class climbingStairs {
    static int climbStairs(int n){
        if(n<=1){
            return 1;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of climb stairs : ");
        int n=sc.nextInt();
        int ans=climbStairs(n);
        System.out.println("The no of ways to climb stairs is : "+ans);

    }
}
