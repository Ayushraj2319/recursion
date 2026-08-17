import java.util.*;
class Main {
    static void subsets(int[] arr, int index, int[] current, int size) {
        //System.out.print("[ ");
        if (index == arr.length) {

            System.out.print("[");
            for (int i = 0; i < size; i++) {
                System.out.print(current[i]);

                if (i < size - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            
            //System.out.println("]");
            return;
        }

        // Don't take arr[index]
        subsets(arr, index + 1, current, size);

        // Take arr[index]
        current[size] = arr[index];
        subsets(arr, index + 1, current, size + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        int[] current = new int[arr.length];

        subsets(arr, 0, current, 0);
    }
}