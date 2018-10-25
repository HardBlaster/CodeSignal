boolean evenDigitsOnly(int n) {
    boolean check = true;
    String kaka = n + "";
    for(char c : kaka.toCharArray())
        if((int)c % 2 !=0) check = false;
    return check;
}
