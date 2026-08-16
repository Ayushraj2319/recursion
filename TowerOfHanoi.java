import java.util.*;
public class TowerOfHanoi {
    static void tower(int n,char S,char H,char D){
        if(n==0){
            return;
        }
        tower(n-1,S,D,H);
        System.out.println("Move disk"+n+" from"+"Source "+S+" to Destination "+D);
        tower(n-1,H,S,D);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of disks : ");
        int n=sc.nextInt();
        tower(n-1,'S','H','D');
    }
}
