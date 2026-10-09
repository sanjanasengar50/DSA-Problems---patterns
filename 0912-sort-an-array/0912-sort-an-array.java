class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        // build a max heap, starting from the last parent node
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // repeatedly move the biggest element to the end, then fix the heap
        for (int end = n - 1; end > 0; end--) {
            swap(nums, 0, end);
            heapify(nums, end, 0);
        }

        return nums;
    }

    private void heapify(int[] nums, int size, int i) {
        while (true) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < size && nums[left] > nums[largest]) largest = left;
            if (right < size && nums[right] > nums[largest]) largest = right;

            // parent is already bigger than both children, we're done
            if (largest == i) break;

            swap(nums, i, largest);
            i = largest;  // keep sinking the element down
        }
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}