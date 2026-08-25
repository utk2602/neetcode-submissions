class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;

        String s = Long.toString(Math.abs((long)x));
        String a = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            a += s.charAt(i);
        }

        long ans = Long.parseLong(a);

        if (negative) {
            ans = -ans;
        }

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) ans;
    }
}