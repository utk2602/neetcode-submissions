
class CountSquares {

    HashMap<Integer, Integer> mp;

    public CountSquares() {
        mp = new HashMap<>();
    }

    public void add(int[] point) {
        int key = point[0] * 1001 + point[1];
        mp.put(key, mp.getOrDefault(key, 0) + 1);
    }

    public int count(int[] point) {
        int qx = point[0];
        int qy = point[1];
        int ans = 0;

        for (int key : mp.keySet()) {

            int x = key / 1001;
            int y = key % 1001;

            if (x == qx || Math.abs(x - qx) != Math.abs(y - qy)) {
                continue;
            }

            int p1 = x * 1001 + qy;
            int p2 = qx * 1001 + y;

            ans += mp.get(key)
                    * mp.getOrDefault(p1, 0)
                    * mp.getOrDefault(p2, 0);
        }

        return ans;
    }
}