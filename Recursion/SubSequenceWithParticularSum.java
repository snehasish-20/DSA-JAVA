/* Find all the sub sequences of an array whose sum is equal to a given number 
Time complexity: O(2^n * n)
Space Complexity: O(n)
*/
import java.util.*;
public class SubSequenceWithParticularSum {
    static ArrayList<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int sum=2;
        subSeq(arr,0,0,sum);
    }
    static void subSeq(int arr[], int index, int seqSum, int sum)
    {
        if(index==arr.length)
        {
            if(seqSum==sum)
             System.out.println(list);
            return;
        }
        //consider arr[i] in sub sequence sum
        list.add(arr[index]);
        seqSum+=arr[index];
        subSeq(arr, index+1, seqSum, sum);
        //don't consider arr[i] in for sub sequence sum
        list.remove(list.size()-1);
        seqSum-=arr[index];
        subSeq(arr, index+1, seqSum, sum);
    }
}
