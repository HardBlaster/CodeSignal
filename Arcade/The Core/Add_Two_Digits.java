int addTwoDigits(int n) {
    int fdigit = (int) n/10;
    int sdigit = n%10;
    return fdigit+sdigit;
}
