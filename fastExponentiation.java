import java.util.Scanner;

public class fastExponentiation {
    public static double Power(double x,int n){
      int biform=n;
      double ans=1;
      if(biform<0){
          biform=-biform;
          x=1/x;
      }
      while(biform>0){
        if(biform%2==1){
            ans*=x;
        }
        x*=x;
        biform/=2;
      }
      return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        int n=sc.nextInt();
        double answer=Power(x,n);
        System.out.println(answer);
    }
}
