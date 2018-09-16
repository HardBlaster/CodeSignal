int[] sortByHeight(int[] a) {
        int len = a.length;
        int blen = 0;
        for(int i = 0; i < len; i++)
        {
                if(a[i] != -1) blen++;
        }
        int[] b = new int[blen];
        int counter = 0;
        for(int i = 0; i < len; i++)
        {
                if(a[i] != -1) 
                {
                        b[counter] = a[i];
                        counter++;
                }
        }
        Arrays.sort(b);
        counter = 0;
        for(int i = 0; i < len; i++)
        {
                if(a[i] != -1) 
                {
                        a[i] = b[counter];
                        counter++;
                }
        }
    return a;
}