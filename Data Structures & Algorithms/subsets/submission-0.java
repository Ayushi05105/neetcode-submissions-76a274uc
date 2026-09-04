class Solution {
    public List<List<Integer>> helper(int[] nums,int idx,List<Integer> ds,List<List<Integer>> ans){
         
         ans.add(new ArrayList<>(ds));
         for(int i = idx;i<nums.length;i++){
            if( i != idx && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            helper(nums,i+1,ds,ans);
            ds.remove(ds.size()-1);
         }
        return ans; 
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}
