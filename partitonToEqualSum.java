import java.util.*;


public class partitonToEqualSum {
    static boolean solve(int[] arr,int index,int sum){
        if(sum==0){
            return true;
        }
        if(index==arr.length || sum<0){
            return false;
        }
        boolean include=solve(arr,index+1,sum-arr[index]);
        boolean exclude=solve(arr,index+1,sum);
        return include || exclude;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum%2==1){
            System.out.println(false);
            return ;
        }
        int m=sum/2;
        boolean ans=solve(arr,0,m);
        System.out.println(ans);
    }
}
