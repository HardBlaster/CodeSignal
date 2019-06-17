int isSumOfConsecutive2(int n) {
    int ways = 0;
    
    for(int i = 1; i < n; i++){
        int tmp = n;
        int bab = i;
        
        while(tmp > 0){
            tmp -= bab;
            bab++;
        }
        
        if(tmp == 0)
            ways++;
    }
    
    return ways;
}
