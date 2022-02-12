// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

// It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
// https://leetcode.com/problems/combination-sum/

import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        allCombinations(0,candidates,target,arr,new ArrayList<>());
        return arr;
        
    }
    public void allCombinations(int index,int[] candidates,int target, List<List<Integer>> arr, List<Integer> ds)
    {
        if(index==candidates.length)
        {
            if(target==0)
                arr.add(new ArrayList<>(ds));
            return;
        }
        if(candidates[index]<=target)
        {
            ds.add(candidates[index]);
            allCombinations(index,candidates,target-candidates[index],arr,ds);
            ds.remove(ds.size()-1);
        }
        allCombinations(index+1,candidates,target,arr,ds);
    }
}