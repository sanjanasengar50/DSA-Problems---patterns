class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, int remaining, int start,
        List<Integer> path, List<List<Integer>> res) {
        if (remaining == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            // same value already tried at this position, skip it
            if (i > start && nums[i] == nums[i - 1]) continue;

            // sorted, so everything after this is too big as well
            if (nums[i] > remaining) break;

            path.add(nums[i]);
            backtrack(nums, remaining - nums[i], i + 1, path, res);  // i + 1, each number used once
            path.remove(path.size() - 1);
        }
    }
}