class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = helper(n);
        }
        return n == 1;
    }
    public int helper(int n) {
        int s = 0;
        while (n != 0) {
            int d = n % 10;
            s += d * d;
            n /= 10;
        }
        return s;
    }
}