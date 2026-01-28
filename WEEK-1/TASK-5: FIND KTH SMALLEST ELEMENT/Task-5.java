import java.util.Arrays;
public class kthSmallest{
    public static void main(String[] args){
        int[] arr={23,35,57,76,86};
        int k=3;
        Arrays.sort(arr);
        System.out.println("kth smallest element is:"+arr[k-1]);
   }
}
