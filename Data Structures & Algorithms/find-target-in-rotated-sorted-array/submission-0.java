class Solution {
    public int search(int[] nums, int target) {
        int c =0;
        for(int i : nums){
            if(i==target){
                return c ;
            }
            c+=1;
        }
        return -1 ;
    }
}
