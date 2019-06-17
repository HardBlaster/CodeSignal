boolean isSmooth(int[] arr) {
    if(arr.length % 2 != 0)
        if(arr[0] == arr[arr.length-1] && arr[0] == arr[(int) (arr.length-1)/2]) return true;
        else return false;
    else
        if(arr[0] == arr[arr.length-1] && arr[0] == (arr[(int) (arr.length)/2] + arr[(int) (arr.length)/2-1])) return true;
        else return false;
}
