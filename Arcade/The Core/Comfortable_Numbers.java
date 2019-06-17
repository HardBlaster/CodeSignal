int comfortableNumbers(int l, int r) {
    int pairs = 0;
    
    for(int i = l; i <= r; i++) 
        for(int j = i+1; j <= r; j++) {
            int sumDigitsA = sumDigits(i);
            int sumDigitsB = sumDigits(j);
            
            if((i <= j + sumDigitsB) && (i >= j - sumDigitsB) 
               && (j <= i + sumDigitsA) && (j >= i - sumDigitsA))
                pairs++;            
        }
    
    return pairs;
}

int sumDigits(int number) {
    String tmp = "" + number;
    int sum = 0;
    
    for(char c : tmp.toCharArray())
        sum += Integer.parseInt("" + c);
    
    return sum;
}
