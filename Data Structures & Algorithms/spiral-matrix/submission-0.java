class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int t = 0;
        int l = 0;
        int b = matrix.length - 1;
        int r = matrix[0].length - 1;
        while (t <= b && l <= r) {
            for (int col = l; col <= r; col++) {
                res.add(matrix[t][col]);
            }
            t++;
            for (int row = t; row <= b; row++) {
                res.add(matrix[row][r]);
            }
            r--;
            if (t <= b) {
                for (int col = r; col >= l; col--) {
                    res.add(matrix[b][col]);
                }
                b--;
            }
            if (l <= r) {
                for (int row = b; row >= t; row--) {
                    res.add(matrix[row][l]);
                }
                l++;
            }
        }
        return res;
    }
}