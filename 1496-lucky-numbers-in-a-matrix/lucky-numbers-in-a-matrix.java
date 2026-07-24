


class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int col = 0;
            for (int j = 1; j < matrix[0].length; j++)
                if (matrix[i][j] < matrix[i][col])
                    col = j;

            int k = 0;
            while (k < matrix.length && matrix[k][col] <= matrix[i][col])
                k++;

            if (k == matrix.length)
                ans.add(matrix[i][col]);
        }

        return ans;
    }
}