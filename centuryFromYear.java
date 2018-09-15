int centuryFromYear(int year) {
    int y = (int)(year/100);
    if(year == y*100)
    {
        return y;
    }
    else 
    {
        return y+1;
    }
}