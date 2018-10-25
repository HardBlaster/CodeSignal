boolean sudoku(int[][] grid) {
    int[] counter = new int[9];
    int[] counter2 = new int[9];
    for(int i = 0; i < 9; i++)
    {
        for(int j = 0; j < 9; j++)
        {
            counter[grid[i][j]-1]++;
            counter2[grid[j][i]-1]++;
        }
        for(int j = 0; j < 9; j++)
            if(counter[j] != 1 || counter2[j] != 1) return false;
        for(int j = 0; j < 9; j++)
        {
            counter2[j] = 0;
            counter[j] = 0;
        }
    }
    for(int i = 1; i <= 7; i += 3)
        for(int j = 1; j <= 7; j  += 3)
        {
            for(int a = -1; a <= 1; a++)
                for(int b = -1; b <= 1; b++)
                    counter[grid[i+a][j+b]-1]++;
            for(int c = 0; c < 9; c++)
                if(counter[c] != 1) return false;
            for(int c = 0; c < 9; c++)
                counter[c] = 0;
        }
    return true;
}
