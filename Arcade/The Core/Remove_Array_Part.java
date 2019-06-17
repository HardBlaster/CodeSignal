int[] removeArrayPart(int[] inputArray, int l, int r) {
    int[] result = new int[inputArray.length - (r-l+1)];
    int k = 0;
    for(int i = 0; i < inputArray.length; i++)
        if(i > r || i < l) result[k++] = inputArray[i];
    return result;
}
