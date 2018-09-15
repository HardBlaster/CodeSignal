String[] addBorder(String[] picture) {
    int n = picture.length;
    int len = picture[0].length();
    String[] pout = new String[n+2];
    pout[0] = pout[n+1] = "";
    for(int i = 0; i < len+2; i++) pout[0] += "*";
    for(int i = 0; i < n; i++) pout[i+1] = "*" + picture[i] + "*";
    for(int i = 0; i < len+2; i++) pout [n+1] += "*";
    return pout;
}
