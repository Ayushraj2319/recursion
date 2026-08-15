import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        generate(nums,0,current,result);
        return result;
    }
    static void generate(int[] nums,int index,List<Integer> current,List<List<Integer>> result){
        if(index==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        generate(nums,index+1,current,result);

        current.remove(current.size()-1);
        generate(nums,index+1,current,result);
    }
}
    

