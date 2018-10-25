int[] metroCard(int lastNumberOfDays) {
    if(lastNumberOfDays == 31) 
    {
        int[] bab = {28, 30, 31};
        return bab;
    }
    else 
    {
        int[] bab = {31};
        return bab;
    }
}
