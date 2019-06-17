int pagesNumberingWithInk(int current, int numberOfDigits) {
    numberOfDigits -= digitsOf(current);
    
    while(true) {
        current++;
        if(numberOfDigits >= digitsOf(current)) 
            numberOfDigits -= digitsOf(current);
        else
            return current-1;
    }
}

int digitsOf(int number) {
    String tmp = "" + number;
    return tmp.length();
}
