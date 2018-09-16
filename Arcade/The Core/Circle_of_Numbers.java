int circleOfNumbers(int n, int firstNumber) {
    if((firstNumber + n/2) < n) return firstNumber + n/2;
    else return firstNumber - n/2;
}
