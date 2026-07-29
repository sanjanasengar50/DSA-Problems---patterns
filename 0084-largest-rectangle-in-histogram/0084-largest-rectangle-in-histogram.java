import java.util.Stack;

class Solution {

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> s = new Stack<>();

        // Find Next Smaller Element to the Right
        for (int i = n - 1; i >= 0; i--) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            right[i] = s.isEmpty() ? n : s.peek();

            s.push(i);
        }

        s.clear();

        // Find Previous Smaller Element to the Left
        for (int i = 0; i < n; i++) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            left[i] = s.isEmpty() ? -1 : s.peek();

            s.push(i);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {

            int width = right[i] - left[i] - 1;

            int area = heights[i] * width;

            ans = Math.max(ans, area);
        }

        return ans;
    }
}
