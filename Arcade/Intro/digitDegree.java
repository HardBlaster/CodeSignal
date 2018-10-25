int digitDegree(int n) {
    int m = n;
    int k = 0;
    if(n < 10) return 0;
    for(;;)
    {
        String kaka = m + "";
        m = 0;
        for(char c : kaka.toCharArray())
            m += Character.getNumericValue(c);
        if(m < 10) return k+1;
        k++;
    }
}
