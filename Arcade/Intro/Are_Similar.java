boolean areSimilar(int[] a, int[] b) {
    int len = a.length;
    int nomatch = 0;
    int counter = 0;
    int[] kaka = new int[2];
    int[] kaka2 = new int[2];
    for(int i = 0; i < len; i++)
        if(a[i] != b[i]) nomatch++;
    if(nomatch > 2) return false;
    else 
    {
        for(int i = 0; i < len; i++)
        {
            if(a[i] != b[i]) 
            {
                kaka[counter] = a[i];
                kaka2[counter] = b[i];
                counter++;
            }
        }
        if(kaka[0] == kaka2[1] & kaka[1] == kaka2[0]) return true;
        else return false;
    }
}
