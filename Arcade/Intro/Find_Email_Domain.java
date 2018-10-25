String findEmailDomain(String address) {
    int index = 0;
    for(int i = address.length()-1; i >=0; i--)
        if(address.charAt(i) == '@')
        {
            index = i;
            break;
        }
    String out = "";
    for(int i = index+1; i < address.length(); i++)
        out += address.charAt(i);
    return out;
}
