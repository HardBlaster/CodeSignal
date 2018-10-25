String messageFromBinaryCode(String code) {
    String msg = "";
    for(int i = 0; i < code.length()-8; i += 8)
        msg += (char) Integer.parseInt(code.substring(i, i+8), 2);
    return msg+((char) Integer.parseInt(code.substring(code.length()-8, code.length()), 2));
}
