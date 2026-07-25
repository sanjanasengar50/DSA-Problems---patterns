class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> ans = new ArrayList<>();

        int srow = 0;
        int scol = 0;
        int erow = m - 1;
        int ecol = n - 1;

        while (srow <= erow && scol <= ecol) {

            // Top
            for (int j = scol; j <= ecol; j++) {
                ans.add(matrix[srow][j]);
            }

            // Right
            for (int i = srow + 1; i <= erow; i++) {
                ans.add(matrix[i][ecol]);
            }

            // Bottom
            if (srow < erow) {
                for (int j = ecol - 1; j >= scol; j--) {
                    ans.add(matrix[erow][j]);
                }
            }

            // Left
            if (scol < ecol) {
                for (int i = erow - 1; i > srow; i--) {
                    ans.add(matrix[i][scol]);
                }
            }

            srow++;
            erow--;
            scol++;
            ecol--;
        }

        return ans;
    }
}