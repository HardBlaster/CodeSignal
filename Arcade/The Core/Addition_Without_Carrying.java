int additionWithoutCarrying(int param1, int param2) {
    String num1 = param1 + "";
    String num2 = param2 + "";
    int result = 0;
    for(int i = 0; i < Math.max(num1.length(), num2.length()); i++) {
        int tmp = 0;
        if(i < num1.length()) 
            tmp += Character.getNumericValue(num1.charAt(num1.length()-i-1));
        if(i < num2.length())
            tmp += Character.getNumericValue(num2.charAt(num2.length()-i-1));
        if(tmp >= 10) tmp -=10;
        result += tmp*Math.pow(10, i);
    }
    return result;
}
