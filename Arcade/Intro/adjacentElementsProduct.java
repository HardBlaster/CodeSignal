int adjacentElementsProduct(int[] inputArray) {
    int maxp = inputArray[0] * inputArray[1];
    for(int i = 1; i < inputArray.length-1; i++)
    {
        if(maxp < inputArray[i] * inputArray[i+1])
        {
            maxp = inputArray[i] * inputArray[i+1];
        }
    }
    return maxp;
}