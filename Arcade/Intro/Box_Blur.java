int[][] boxBlur(int[][] image) {
    int row = image.length;
    int col = image[0].length;
    int[][] blur = new int[row-2][];
    for(int i = 1; i < row-1; i++)
    {
        blur[i-1] = new int[col-2];
        for(int j = 1; j < col-1; j++)
        {
            blur[i-1][j-1] = (int) (image[i][j] + image[i+1][j] + image[i][j+1] + image[i-1][j] + image[i][j-1] + image[i+1][j+1] + image[i-1][j-1] + image[i-1][j+1] + image[i+1][j-1])/9;
        }
    }
    return blur;
}
