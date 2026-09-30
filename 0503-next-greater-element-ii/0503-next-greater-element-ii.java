class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        // Initially, no next greater element is found
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();

        // Traverse array twice because it is circular
        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            // Remove elements that cannot be the answer
            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }

            // Top of stack is the next greater element
            if (!stack.isEmpty()) {
                ans[index] = stack.peek();
            }

            // Add current element
            stack.push(nums[index]);
        }

        return ans;
    }
}