import java.util.*;
public class binToDecimal {
    static  int convert(int n){
        if(n==0) return 0;

        return convert(n/2)*10+n%2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(convert(n));
    }
}
