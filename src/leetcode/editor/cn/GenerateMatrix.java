package leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author shenyw@citycloud.com.cn
 **/
public class GenerateMatrix {
    int number = 1;

    public int[][] generateMatrix(int n) {
        int start = 0;
        int idx = n - 1;
        int[][] matrix = new int[n][n];
        while (start < idx) {
            setCircle(start, idx, matrix);
            start++;
            idx--;
        }
        if (start == idx) {
            matrix[idx][idx] = number;
        }
        return matrix;
    }

    private void setCircle(int start, int n, int[][] matrix) {
        for (int i = start; i <= n; i++)
            matrix[start][i] = number++;
        for (int i = start + 1; i <= n; i++)
            matrix[i][n] = number++;
        for (int i = n - 1; i >= start; i--)
            matrix[n][i] = number++;
        for (int i = n - 1; i > start; i--)
            matrix[i][start] = number++;
    }

    public static void main(String[] args) {
        GenerateMatrix matrix = new GenerateMatrix();
        int[][] result = matrix.generateMatrix(4);
        for (int i=0;i<result.length;i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
