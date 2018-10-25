boolean isInfiniteProcess(int a, int b) {
    return a > b || Math.abs(a-b) % 2 != 0;
}
