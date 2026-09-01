class Solution {
    public int jump(int[] nums) {
      int ans =0;
      int l =0;
      int r =0;
      int fart=0;
      while(r<nums.length-1){
        for(int i =l ; i < r+1 ; i++){
            fart=Math.max(fart,nums[i]+i);
        }
        l=r+1;
        r=fart;
        ans+=1;
      }  
      return ans;
    }
}
