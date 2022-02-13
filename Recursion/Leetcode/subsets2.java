class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        findSets(0,nums,ans,new ArrayList<>());
        return ans;
    }
    void findSets(int index,int[] nums,List<List<Integer>> ans,List<Integer> ds)
    {
        if(index==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            if(i!=index && nums[i]!=nums[i-1])
                continue;
            ds.add(nums[i]);
            findSets(index+1,nums,ans,ds);
            ds.remove(ds.size()-1);    
        }
    }
}