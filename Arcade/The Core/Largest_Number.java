int largestNumber(int n) {
    String num = "";
    for(int i = 0; i < n; i++) num += '9';
    return Integer.parseInt(num);
}
