int arrayPacking(int[] a) {
    int num = 0;
    for(int i = 0; i < a.length; i++)
        num += a[i] << 8 * i;
    return num;
}
