import java.util.*;

public class fibonacci {
    static int calls = 0;

    public static int solve(int n){
        calls++;

        if(n <= 1) return n;

        return solve(n-1) + solve(n-2);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(solve(i) + " ");
        }

        System.out.println("\nTotal calls = " + calls);
    }
}
