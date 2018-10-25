int avoidObstacles(int[] inputArray) {
    int len = inputArray.length;
    Arrays.sort(inputArray);

    for(int i = 2;; i++)
    {
        boolean bab = true;
        for(int j = 0; j < len; j++)
            if(inputArray[j] % i != 0) bab = bab && true;
        else bab = bab && false;
        if(bab) return i;
    }
}
