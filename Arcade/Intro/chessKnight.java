int chessKnight(String cell) {
    int x = Character.getNumericValue(cell.charAt(0))-9;
    int y = Character.getNumericValue(cell.charAt(1));
    int m = 0;
    for(int i = -2; i < 3; i++)
    {
        for(int j = -2; j < 3; j++)
        {
            if(Math.abs(i * j) == 2)
            {
                if((x+i >= 1 && x+i <= 8) && (y+j >= 1 && y+j <= 8)) m++;
            }
        }
    }
    return m;    
}
