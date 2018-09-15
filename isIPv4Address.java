boolean isIPv4Address(String inputString) {
    int len = inputString.length();
    if(len < 7 || len > 15) return false;
    int dotnum = 0;
    for(int i = 0; i < len; i++)
        if(inputString.charAt(i) == '.') dotnum++;
    if(dotnum != 3) return false;
    String[] kaka = inputString.split("\\.");
    for(int i = 0; i < 4; i++)
    {
        if(kaka[i].isEmpty()) return false;
        else
        {
            for(char c : kaka[i].toCharArray())
            {
                if(!Character.isDigit(c)) return false;
            }
        }
        if(Integer.parseInt(kaka[i]) > 255) return false;
    }
    return true;
}
