int[] firstReverseTry(int[] arr) {
    if(arr.length == 1 || arr.length == 0) return arr;
    else {
    int tmp = arr[0];
    arr[0] = arr[arr.length-1];
    arr[arr.length-1] = tmp;
    return arr;
    }
}
