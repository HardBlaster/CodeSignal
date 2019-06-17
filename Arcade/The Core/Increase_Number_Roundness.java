boolean increaseNumberRoundness(int n) {
    String num = n + "";
    boolean status = false;
    int j = 0;
    for(int i = num.length()-1; i >=0; i--)
        if(num.charAt(i) != '0') {
            j = i;
            break;
        }
    for(int i = j; i >= 0; i--)
        if(num.charAt(i) == '0') status = true;
    return status;
}
