int[] weakNumbers(int n) {
    int maxWeakness = 0;
    for(int i = 1; i <= n; i++)
        if(getWeakness(i) > maxWeakness)
            maxWeakness = getWeakness(i);
    
    int counter = 0;
    for(int i = 1; i <= n; i++)
        if(getWeakness(i) == maxWeakness)
            counter++;
    
    return new int[] {maxWeakness, counter};
}

int getWeakness(int number) {
    int weakness = 0;
    int divisors = getDivisors(number);
    for(int i = number-1; i >= 1; i--)
        if(divisors < getDivisors(i))
            weakness++;
    
    return weakness;
}

int getDivisors(int n) { 
    int divisors = 0; 
    for (int i = 1; i <= Math.sqrt(n); i++) { 
        if (n%i == 0)
            if (n/i == i) 
                divisors++; 
            else  
                divisors += 2;  
    } 
    
    return divisors; 
} 
