/*To reverse an array
Time complexity: O(n/2)
Space Complexity: O(n/2)
*/
import java.util.*;
public class reverseArray {
    static int arr[]=new int[]{1,2,3,4,5};
    public static void main(String[] args) {
        reverse(0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int l,int r)
    {
        if(l>=r)
         return ;
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverse(l+1, r-1);
    }
}