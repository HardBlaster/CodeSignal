String longestWord(String text) {
    String[] words = text.split(" ");
    for(int i = 0; i < words.length; i++)
        words[i] = GetWord(words[i]);
    int maxlen = 0;
    String max = "";
    for(String s: words)
        if(maxlen < s.length())
        {
            maxlen = s.length();
            max = s;
        }
    return max;
}


String GetWord(String s)
{
    String str = "", str2 = "";
    for(char c: s.toCharArray())
        if(Character.isLetter(c)) str += c;
        else
        {
            if(str.length() > str2.length())
            {
                str2 = str;
                str = "";
            }
        }
    if(str2.isEmpty()) 
        str2 = str;
    return str2;
}
