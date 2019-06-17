boolean isPower(int n) {
    if(n == 1)
        return true;
    
    for(int i = 2; i <= Math.sqrt(n); i++) 
        for(int pow = 2; pow <= Math.sqrt(n); pow++)
            if(Math.pow(i, pow) == n)
                return true;

    return false;
}
