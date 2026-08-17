import java.util.*;;

public class fastexponentiation2 {
    static double power(double x, long n){
        if(n==0){
            return 1;
        }
        double half=power(x,n/2);
        if(n%2!=0){
            return half*half*x;
        }
        else{
            return half*half;
        }
    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        long n=sc.nextInt();
        double ans=power(x,n);
        System.out.println(ans);
    }
}
