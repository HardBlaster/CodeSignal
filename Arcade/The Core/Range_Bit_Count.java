int rangeBitCount(int a, int b) {
    int num = 0;
    for(int i = a; i <= b; i++)
    {
        int bab = i;
        while(bab != 0) 
        {
            if((bab & 1) == 1) num++;
                bab = bab >> 1;
        }
    }
    return num;
}
