int phoneCall(int min1, int min2_10, int min11, int s) {
    if(s < min1) return 0;
    s -= min1;
    if(s == 0) return 1;
    int min = 1;
    if(s/min2_10 <= 9) min += s/min2_10;
    else 
    {
        min += 9;
        s -= min2_10*9;
        min += s/min11;
    }
    return min;
}
