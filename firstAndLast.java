import java.util.*;
public class firstAndLast {
    static int firstOcc(int[] arr,int target,int i,int j){
        if(i>j){
            return -1;
        }
        int mid=i+(j-i)/2;
        if(arr[mid]==target){
            if(mid==0 || arr[mid-1]!=target){
                System.out.println(mid);
                return mid;
            }
            else{
                return firstOcc(arr,target,i,mid-1);
            }
        }
        else if(arr[mid]<target){
            return firstOcc(arr,target,mid+1,j);
        }
        else{
            return firstOcc(arr,target,i,mid-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        firstOcc(arr,target,0,arr.length-1);
    }
}
