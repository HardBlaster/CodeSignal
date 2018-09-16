boolean checkPalindrome(String inputString) {
    boolean a = true;
    int x = inputString.length() - 1;
    String valami = "";
    for(int i = x; i >= 0; i--)
    {
        valami += inputString.charAt(i);
    }
    for(int i = 0; i <= x; i++)
    {
        if(valami.charAt(i) != inputString.charAt(i))
        {
            a = false;
        }
    }
    return a;
}