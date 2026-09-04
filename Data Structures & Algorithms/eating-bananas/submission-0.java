class Solution {

    public int totalHour(int[] piles,int speed){
        int total =0;
        for(int i: piles){
            total += (i+speed-1)/speed;
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxPile = piles[0];
        for(int i =0;i<n;i++){
            maxPile = Math.max(maxPile,piles[i]);
        }
        int low =1;
        int high = maxPile;
        int ans = maxPile;
        while(low <= high){
            int mid = (low + high)/2;
            long hr = totalHour(piles,mid);
            if(hr > h){
                low = mid+1;
            }
            else{
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}
