int appleBoxes(int k) {
    int result = 0;
    for(int i = 1; i <= k; i++)
        if(i % 2 == 0) result += i*i;
        else result -= i*i;
    return result;
}
