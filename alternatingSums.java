int[] alternatingSums(int[] a) {
    int len = a.length;
    int[] sums = new int[2];
    for(int i = 0; i < len; i += 2) sums[0] += a[i];
    for(int i = 1; i < len; i += 2) sums[1] += a[i];
    return sums;
}
