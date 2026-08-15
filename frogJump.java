import java.util.*;
public class frogJump {
    static int FrogJump(int[] arr,int n){
        if(n==0){
            return 0;

        }
        int jump1=FrogJump(arr,n-1)+Math.abs(arr[n]-arr[n-1]);
        int jump2=Integer.MAX_VALUE;
        if(n>1){
            jump2=FrogJump(arr,n-2)+Math.abs(arr[n]-arr[n-2]);
        }
        return Math.min(jump1,jump2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of stairs : ");
        int n=sc.nextInt();
        System.out.println("Cost of each stair : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=FrogJump(arr,n-1);
        System.out.println("The minimum cost to reach the top is : "+ans);
    }
}
