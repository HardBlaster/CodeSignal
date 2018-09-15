String reverseParentheses(String s) {
    String kaki = "";
    String bab = "";
    String zsa = "";
    int len = s.length();
    int n = 0;
    int j =0;
    for(int i = 0; i < len; i++)
    {
            if(s.charAt(i) == '(')
                    n++;
    }
    int T[] = new int[n];
    for(int i = 0; i < len; i++)
    {
            if(s.charAt(i) == '(')
            {
                    T[j] = i;
                    j++;
            }
    }
    j = 0;
    while(n > 0)
    {
            j = T[n-1] + 1;
            while(s.charAt(j) != ')')
            {
                    kaki += s.charAt(j);
                    j++;
            }
            for(int q = kaki.length()-1 ; q >= 0; q--)
                    bab += kaki.charAt(q);
            zsa = s.substring(0,T[n-1]) + bab + s.substring(T[n-1]+bab.length()+2);
            s = zsa;
            n--;
            zsa = "";
            kaki = "";
            bab = "";
    }
    return s ;
}
