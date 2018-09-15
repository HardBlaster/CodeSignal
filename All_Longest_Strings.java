String[] allLongestStrings(String[] inputArray) {
    int maxlen = 0;
    int len = inputArray.length;
    for(int i = 0; i < len; i++)
        if(maxlen < inputArray[i].length()) maxlen = inputArray[i].length();
    int j = 0;
    int jj = 0;
    for(int i = 0; i < len; i++)
        if(inputArray[i].length() == maxlen) j++;
    String[] out = new String[j];
    for(int i = 0; i < len; i++)
        if(inputArray[i].length() == maxlen) 
        {
            out[jj] = inputArray[i];
            jj++;
        }
    return out;
}
