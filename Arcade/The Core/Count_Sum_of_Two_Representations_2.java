int countSumOfTwoRepresentations2(int n, int l, int r) {
    int ways = 0;
    for(int i = l; i < r+1; i++)
    {
        int k = n - i;
        if(k >= i && k >= l && k <= r)
            ways++;
    }
    return ways; 
}
