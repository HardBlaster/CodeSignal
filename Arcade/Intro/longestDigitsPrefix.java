String longestDigitsPrefix(String inputString) {
    String out = "";
    int i = 0;
    for(char babok : inputString.toCharArray())
        if(Character.isDigit(babok)) out += babok;
        else break;
    return out;
}
