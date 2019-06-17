int squareDigitsSequence(int a0) {
    List sequence = new ArrayList();
    int counter = 1;
        
    while(!sequence.contains(a0)){
        sequence.add(a0);
        int[] digits = getDigits(a0);
    
        a0 = 0;
        for(int i : digits)
            a0 += i*i;
        
        counter++;
    }
    
    return counter;
}

int[] getDigits(int number) {
    String tmp = "" + number;
    int[] digits = new int[tmp.length()];
    
    for(int i = 0; i < tmp.length(); i++)
        digits[i] = Integer.valueOf("" + tmp.charAt(i)) ;
    
    return digits;
}
