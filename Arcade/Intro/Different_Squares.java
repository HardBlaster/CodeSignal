int differentSquares(int[][] matrix) {
    int[] lmat = new int[(matrix.length-1)*(matrix[0].length-1)];
    int k = 0;
    for(int i = 0; i < matrix.length-1; i++)
        for(int j = 0; j < matrix[0].length-1; j++)
        {
            lmat[k] = matrix[i][j]*1000 + matrix[i][j+1]*100 + matrix[i+1][j]*10 + matrix[i+1][j+1];
            k++;
        }
    HashSet<Integer> rak = new HashSet<Integer>();
    for(int i = 0; i < k; i++)
        rak.add(lmat[i]);
    return rak.size();
}
