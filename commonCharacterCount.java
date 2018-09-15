int commonCharacterCount(String s1, String s2) {
    int len1 = s1.length();
    int len2 = s2.length();
    int counter = 0;
    StringBuilder s3 = new StringBuilder(s2);
    for(int i = 0; i < len1; i++)
    {
        for(int j = 0; j < len2; j++)
        {
            if(s1.charAt(i) == s3.charAt(j)) 
            {
                counter++;
                s3.setCharAt(j, '-');
                break;
            }
        }
    }
    return counter;
}