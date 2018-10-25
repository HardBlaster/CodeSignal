boolean isBeautifulString(String inputString) {
    int[] kaka = new int[26];
    for(char c: inputString.toCharArray())
        kaka[c - 'a']++;
    for(int i = 0; i < kaka.length-1; i++)
        if(kaka[i] < kaka[i+1]) return false;
    return true;
}
