int countBlackCells(int n, int m) {
    int max = 1;
    for (int i = 1; i <= n; i++) {
        if (n%i == 0 && m%i == 0)
            max = i;
    }
    return n+m+max-2;
}
