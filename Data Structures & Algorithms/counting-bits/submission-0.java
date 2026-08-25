class Solution {
    public int[] countBits(int n) {
        String[] s = new String[n + 1];
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            s[i] = Integer.toBinaryString(i);
        }

        for (int i = 0; i < s.length; i++) {
            int count = 0;

            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) == '1') {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}