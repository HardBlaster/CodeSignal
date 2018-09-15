int arrayMaximalAdjacentDifference(int[] inputArray) {
    int len = inputArray.length;
    int max = 0;
    for(int i = 0; i < len-1; i++)
        if(Math.abs(inputArray[i] - inputArray[i+1]) > max) max = Math.abs(inputArray[i] - inputArray[i+1]);
    return max;
}
