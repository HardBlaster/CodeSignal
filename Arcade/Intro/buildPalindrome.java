String buildPalindrome(String st) {
    String rev = new StringBuffer(st).reverse().toString();
    if(isPalindrome(st)) return st;
    int index = st.length()-1;
    String postfix = "";
    while(!isPalindrome(st+postfix))
    {
        postfix = rev.substring(index, rev.length());
        index--;
    }
    return st+postfix;
}
        

boolean isPalindrome(String s) 
{
    return  (new StringBuilder(s).reverse().toString()).equals(s);
}
