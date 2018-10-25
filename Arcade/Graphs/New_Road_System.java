boolean newRoadSystem(boolean[][] roadRegister) {
    int len = roadRegister.length;
    int[] ki = new int[len];
    int[] be = new int[len];
    for(int i = 0; i < len; i++)
    {
        for(int j = 0; j < len; j++)
        {
            if(roadRegister[i][j]) 
            {
                ki[i]++;
                be[j]++;
            }
        }
    }
    for(int i = 0; i < len; i++)
        if(ki[i] != be[i]) return false;
    return true;
}
