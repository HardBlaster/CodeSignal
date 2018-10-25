int electionsWinners(int[] votes, int k) {
    int max = 0;
    int win = 0;
    int n = 0;
    for(int i: votes)
        if(i >= max) 
        {
            max = i;
            n++;
        }
    if(n == 1 && k == 0) return 1;
    for(int i: votes)
        if(i+k > max) win++;
    return win;
}
