boolean isMAC48Address(String inputString) {
    String[] groups = inputString.split("-");
    if(groups.length != 6 || inputString.charAt(inputString.length()-1) == '-' || inputString.charAt(0) == '-' || inputString.length() != 17) return false;
    for(String s: groups)
        for(char c: s.toCharArray())
            if (!(( c >='0' && c <= '9') || (c >= 'A' && c <= 'F'))) return false;
    return true;
}
