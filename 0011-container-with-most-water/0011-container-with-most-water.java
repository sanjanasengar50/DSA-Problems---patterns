class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length - 1;
        int maxWater = 0;

        while (lp < rp) {
            int w = rp - lp;
            int ht = Math.min(height[lp], height[rp]);

            int currWater = w * ht;
            maxWater = Math.max(maxWater, currWater);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }
}