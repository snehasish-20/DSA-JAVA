/* Find all the sub sequences of an array using the take or not take method  
Time complexity: O(2^n * n)
Space Complexity: O(n)
*/
import java.util.*;
public class printAllSubSequences {
    static ArrayList<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        int arr[]={3,2,1};
        subSeq(arr,0);
    }
    static void subSeq(int arr[],int i)
    {
        if(i==arr.length)
        {
            System.out.println(list);
            return;
        }
        //cosnider arr[i] in the subsequence
        list.add(arr[i]);
        subSeq(arr, i+1);
        //don't cosnider arr[i] in the subsequence
        list.remove(list.size()-1);
        subSeq(arr, i+1);
    }
}
