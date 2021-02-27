package lc;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wei.liang
 * @since 2021/2/25
 */
public class LeetCode_867 {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
