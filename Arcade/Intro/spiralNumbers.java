int[][] spiralNumbers(int n) {
    int[][] out = new int[n][n];
    int num = 1;
    int row = 0;
    while(n > 0)
    {
        for(int i = 0; i < n; i++)
        {
            out[row][i+row] = num;
            num++;
        }
        for(int i = row+1; i < n+row; i++)
        {
            out[i][row+n-1] = num;
            num++;
        }
        for(int i = row+n-2; i > row-1; i--)
        {
            out[row+n-1][i] = num;
            num++;
        }
        for(int i = row+n-2; i > row; i--)
        {
            out[i][row] = num;
            num++;
        }
        n -= 2;
        row++;
    }
    return out;
}
