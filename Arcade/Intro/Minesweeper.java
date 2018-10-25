int[][] minesweeper(boolean[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;
    int[][] mines = new int[row][];
    for(int i = 0; i < row; i++)
    {
        mines[i] = new int[col];
        for(int j = 0; j < col; j++)
        {
            for(int bab = i-1; bab < i+2; bab++)
            {
                for(int puca = j-1; puca < j+2; puca++)
                {
                    if(bab == i && puca == j)
                        continue;
                    else
                    {
                        try 
                        {
                            if(matrix[bab][puca]) mines[i][j]++;
                        }
                        catch
                    }
                }
            }
        }
    }
}
