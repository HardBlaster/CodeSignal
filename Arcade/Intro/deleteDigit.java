int deleteDigit(int n) {
    String s = n + "";
    int num = s.length();
    char[] digits = new char[num];
    int i = 0;
    for(char c: s.toCharArray())
    {
        digits[i] = (c);
        i++;
    }
    int max = 0;
    i = 0;
    String out = "";
    for(int j = 0; j < num; j++)
    {
        for(int k = 0; k < num; k++)
        {
            if(i != k) out += digits[k];
        }
        if(max < Integer.parseInt(out)) max = Integer.parseInt(out);
        out = "";
        i++;
    }
    return max;
}
