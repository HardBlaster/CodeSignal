int candles(int candlesNumber, int makeNew) {
    int sum = candlesNumber, leftover = candlesNumber;
    candlesNumber = 0;
    while(leftover >= makeNew) {
        int tmp = leftover/makeNew;
        leftover -= tmp*makeNew;
        leftover += tmp;
        sum += tmp;
    }
    return sum;
}
