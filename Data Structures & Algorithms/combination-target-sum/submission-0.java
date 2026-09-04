class Solution {

    public void helper(int[] nums,int target,int idx,List<Integer> ds,List<List<Integer>> ans){
        int n = nums.length;
        if(idx == n){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(idx <= target){
            ds.add(nums[idx]);
            helper(nums,target-nums[idx],idx,ds,ans);
            ds.remove(ds.size()-1);
        }
        helper(nums,target,idx+1,ds,ans);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,target,0,new ArrayList<>(),ans);
        return ans;
    }
}
