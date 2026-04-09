class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] arr = new List[n+1];
        for(int ans : map.keySet()){
            int freq = map.get(ans);
            if(arr[freq] == null){
                arr[freq] = new ArrayList<>();
            }
            arr[freq].add(ans);
        }
        int[] res = new int[k];
        int index =0;
        for(int i=n;i>=0;i--){
            if(arr[i] != null){
                for(int num:arr[i]){
                    if(index ==k) break;
                    res[index++] = num;
                    
                }
            }
            if(index == k) break;
        }
        return res;
    }
}
