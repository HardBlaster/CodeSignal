int[] replaceMiddle(int[] arr) {
    if(arr.length%2 == 0) {
        int[] result = new int[arr.length-1];
        
        for(int i = 0; i <= arr.length/2-2; i++)
            result[i] = arr[i];
        
        result[arr.length/2-1] = arr[arr.length/2-1] + arr[arr.length/2];
        
        for(int i = arr.length/2; i < result.length; i++)
                result[i] = arr[i+1];
            
        return result;
    }
    else 
        return arr;
}
