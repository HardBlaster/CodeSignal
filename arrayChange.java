int arrayChange(int[] inputArray) {
    int len = inputArray.length;
    int moves = 0;
    for(int i = 0; i < len-1; i++)
        if(inputArray[i] >= inputArray[i+1]) 
        {
            int move = inputArray[i] - inputArray[i+1] + 1;
            moves += move; 
            inputArray[i+1] += move; 
        }
    return moves;
}

