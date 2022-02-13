// Given an integer array nums of unique elements, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.
// https://leetcode.com/problems/subsets/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        findSets(0,nums,list,new ArrayList<>());
        return list;
    }
    static void findSets(int index,int[] arr,List<List<Integer>> list,List<Integer> ds)
    {
        if(index==arr.length)
        {
            list.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[index]);
        findSets(index+1,arr,list,ds);
        ds.remove(ds.size()-1);
        findSets(index+1,arr,list,ds);
    }
}