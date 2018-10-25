int absoluteValuesSumMinimization(int[] a) {
    int min = 10000000;
    int elem = 0;
    int sum = 0;
    for(int i = 0; i < a.length; i++)
    {
        for(int j = 0; j < a.length; j++)
            sum += Math.abs(a[j] - a[i]);
        if(sum < min) 
        {
            min = sum;
            elem = i;
        }
        sum = 0;
    }
    return a[elem];
}
