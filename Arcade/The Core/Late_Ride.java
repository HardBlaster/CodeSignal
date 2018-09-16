int lateRide(int n) {
    int hour = (int) n/60;
    int minutes = n%60;
    return hour/10 + hour % 10 + minutes/10 + minutes%10;
}
