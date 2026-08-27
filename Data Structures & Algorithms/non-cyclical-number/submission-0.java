class Solution {
    public boolean isHappy(int n) {
        return (helper(n)==1);
    }
    public int helper(int n){
        int s =0;
        while(n!=0){
            s+=(n%10*n%10);
            n/=10;
        }
        return s;
    }
}
