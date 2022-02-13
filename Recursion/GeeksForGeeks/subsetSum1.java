// Given a list arr of N integers, print sums of all subsets in it.

// Note: Return all the element is increasing order.
// https://practice.geeksforgeeks.org/problems/subset-sums2234/1#

class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> sums=new ArrayList<>();
        findSums(0,arr,N,sums,0);
        Collections.sort(sums);
        return sums;
    }
    void findSums(int index,ArrayList<Integer> arr,int n,ArrayList<Integer> sums,int subSetSum)
    {
        if(index==n)
        {
            sums.add(subSetSum);
            return;
        }
        findSums(index+1,arr,n,sums,subSetSum+arr.get(index));
        findSums(index+1,arr,n,sums,subSetSum);
    }
    
}