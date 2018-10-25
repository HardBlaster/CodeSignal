int differentSymbolsNaive(String s) {
    int [] num = new int[256];
    int sum = 0;
    for(char c : s.toCharArray()) num[(int) c]++;
    for(int i = 0; i < 256; i++)
        if(num[i] != 0) sum++;
    return sum;
}
