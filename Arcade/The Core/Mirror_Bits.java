int mirrorBits(int a) {
    int rev = 0;
    while(a > 0)
    {
        rev = rev << 1;
        rev = rev | (a&1);
        a = a >> 1;
    }
    return rev;
}
