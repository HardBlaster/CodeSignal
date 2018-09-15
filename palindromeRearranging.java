boolean palindromeRearranging(String inputString) {
    int len = inputString.length();
    int[] babnum = new int[256];
    for(int i = 0; i < len; i++) babnum[(int) inputString.charAt(i)]++;
    int szaros = 0;
    int bablen = babnum.length;
    for(int i = 0; i < bablen; i++)
        if(babnum[i] % 2 != 0) szaros++;
    if(szaros > 1) return false;
    else return true;
}
