String lineEncoding(String s) {
    s += '1';
    StringBuilder out = new StringBuilder();
    int n = 1;
    for(int i = 0; i < s.length()-1; i++)
    {
        if(s.charAt(i) == s.charAt(i+1)) n++;
        else 
        {
            if(n == 1) out.append(s.charAt(i));
            else 
            {
                out.append(n);
                out.append(s.charAt(i));
                n = 1;
            }
        }
    }
    return out.toString();
}
