import java.util.*;

public class permutationOfStrinng {

    static void solve(String s, String curr, ArrayList<String> ans) {

        if (s.isEmpty()) {
            ans.add(curr);
            return;
        }

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            String remstr = s.substring(0, i) + s.substring(i + 1);

            solve(remstr, curr + ch, ans);
        }
    }

    public static ArrayList<String> permutation(String s) {

        ArrayList<String> ans = new ArrayList<>();

        solve(s, "", ans);

        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        ArrayList<String> ans = permutation(s);

        System.out.println("Permutations:");

        for (String str : ans) {
            System.out.println(str);
        }

        sc.close();
    }
}
