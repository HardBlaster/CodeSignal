String alphabeticShift(String inputString) {
    char[] output = inputString.toCharArray();
    for(int i = 0; i < output.length; i++)
        if(output[i] == 'z') output[i] = 'a';
        else output[i] = (char) (output[i]+1);
    return new String(output);
}
