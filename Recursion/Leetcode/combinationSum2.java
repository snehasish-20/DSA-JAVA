// Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
// Each number in candidates may only be used once in the combination.
// Note: The solution set must not contain duplicate combinations.
// https://leetcode.com/problems/combination-sum-ii/
import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        find(0,ans,target,candidates,new ArrayList<>());
        return ans;
    }
    void find(int index,List<List<Integer>> ans,int target,int[] arr, List<Integer> list){
        
        if(target==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(i> index && arr[i]==arr[i-1])
                continue;
            if(arr[i]>target)
                break;
            list.add(arr[i]);
            find(i+1,ans,target-arr[i],arr,list);
            list.remove(list.size()-1);
        }
    }
}