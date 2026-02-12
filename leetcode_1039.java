//1039
//Minimum Score Triangulation of Polygon
//we have given an array of vertiices of a polygon , we have diide it into triangle and find the minimimum score


class leetcode_1039 {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];

        
        for (int len = 2; len < n; len++) {
            for (int i = 0; i + len < n; i++) {
                int j = i + len;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j],
                        dp[i][k] + dp[k][j] + values[i] * values[k] * values[j]);
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        leetcode_1039 sol = new leetcode_1039();

        int[] values1 = {1, 2, 3};
        System.out.println(sol.minScoreTriangulation(values1)); 
        int[] values2 = {3, 7, 4, 5};
        System.out.println(sol.minScoreTriangulation(values2)); 

        int[] values3 = {1, 3, 1, 4, 1, 5};
        System.out.println(sol.minScoreTriangulation(values3)); 
    }
}
