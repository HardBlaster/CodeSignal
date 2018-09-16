int maxMultiple(int divisor, int bound) {
    for(int i = bound;; i--)
        if(i % divisor == 0) return i;
}
