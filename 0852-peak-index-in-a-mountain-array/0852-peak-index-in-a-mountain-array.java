class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int start = 1;
        int end = arr.length - 2;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Peak found
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // We are on the increasing side
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }

            // We are on the decreasing side
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}