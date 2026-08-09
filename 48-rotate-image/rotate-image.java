class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int[][] rotate = new int[n][n];

        // Create rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotate[j][n - i - 1] = matrix[i][j];
            }
        }

        // Copy rotated matrix back to original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rotate[i][j];
            }
        }
    }
}