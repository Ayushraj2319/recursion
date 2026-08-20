import java.util.*;

public class printSubsequence {

    static void allSubsequences(String s, String current, int index,
                                ArrayList<String> result) {

        if (index == s.length()) {
            result.add(current);
            return;
        }

        // Exclude
        allSubsequences(s, current, index + 1, result);

        // Include
        allSubsequences(s, current + s.charAt(index), index + 1, result);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ArrayList<String> result = new ArrayList<>();

        allSubsequences(s, " ", 0, result);

        Collections.sort(result);
        System.out.println(result);
        // for(int i=0;i<result.size();i++){
        //     System.out.print(result.get(i)+" ");
        // }
    }
}