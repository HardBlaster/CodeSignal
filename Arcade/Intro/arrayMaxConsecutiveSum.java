int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int len = inputArray.length;
    int max = 0;
    int sum = 0;
    for(int i = 0; i <= len-k; i++)
    {
        for(int j = i; j < i+k; j++)
            sum += inputArray[j];
        if(sum > max) max = sum;
        sum = 0;
    }
    return max;
}
