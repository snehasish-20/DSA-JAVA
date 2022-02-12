/* Find the no of  sub sequences of an array whose sum is equal to a given number 
Time complexity: O(2^n * n)
Space Complexity: O(n)
*/
public class NoOfSubSequencesWithParticularSum {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        System.out.println(noOfSubSeq(0,arr,2,0));
    }
    static int noOfSubSeq(int index,int arr[],int sum,int subSeqSum)
    {
        if(index==arr.length)
        {
            if(sum==subSeqSum)
             return 1;
            else
             return 0;
        }
        //consider arr[i] for the sub sequence sum
        int l=noOfSubSeq(index+1, arr, sum, subSeqSum+arr[index]);
        //don't consider arr[i] for the sub sequence sum
        int r=noOfSubSeq(index+1, arr, sum, subSeqSum);
        return l+r;
    }
}
