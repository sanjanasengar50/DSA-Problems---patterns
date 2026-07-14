import java.util.Arrays;

git rm -r --cachedclass Solution {

    public static int[] getConcatenation(int[] arr) {

        int n = arr.length;
        int[] arr1 = new int[2 * n];

        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
            arr1[i + n] = arr[i];
        }

        return arr1;
    }
}

class ConcateArr {

    public static void main(String args[]) {

        int[] arr = {1, 2, 1};

        int[] ans = Solution.getConcatenation(arr);

        System.out.println(Arrays.toString(ans));
    }
}