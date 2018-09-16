boolean isLucky(int n) {
    String num = Integer.toString(n);
    int len = num.length()/2;
    int fsum = 0;
    int ssum = 0;
    for(int i = 0; i < len; i++) fsum += num.charAt(i) - '0';
    for(int i = len; i < len*2; i++) ssum += num.charAt(i) - '0';
    if(fsum == ssum) return true;
    else return false;
}