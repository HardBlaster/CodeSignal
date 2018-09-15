int matrixElementsSum(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;
    int sum = 0;
    for(int i = 0; i < col; i++)
        for(int j = 0; j < row; j++)
            if(matrix[j][i] == 0) break;
            else sum += matrix[j][i];
    return sum;
}