class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones){
            maxHeap.add(stone);
        }
        while(maxHeap.size()>1){
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if(y != x){
                maxHeap.add(y-x);
            }
        }
        if(maxHeap.isEmpty()){
            return 0;
        }
        else{
            return maxHeap.peek();
        }
    }
}
