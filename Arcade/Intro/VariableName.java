boolean variableName(String name) {
    for(char c : name.toCharArray())
        if(c != '_' && !Character.isDigit(c) && !Character.isLetter(c)) return false;
    return !Character.isDigit(name.charAt(0));
}
