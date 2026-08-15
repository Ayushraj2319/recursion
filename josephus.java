import java.util.*;
public class josephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();
        System.out.print("Enter the step count: ");
        int k = sc.nextInt();
        int result = josephus(n, k);
        System.out.println("The safe position is: " + result);
    }

    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }
}