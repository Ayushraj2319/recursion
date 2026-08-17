import java.util.*;
public class printSubsequence {
    static void allSubsequences(String s,String current,int index){
        if(index==s.length()){
            System.out.println(current);
            return;
        }
        allSubsequences(s, current, index+1);
        allSubsequences(s,s.charAt(index)+current,index+1 );
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        allSubsequences(s,"",0);
    }
}
