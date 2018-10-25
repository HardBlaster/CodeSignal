int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
    int curHeight = 0;
    int day = 0;
    for(int i = 1;; i++)
    {
        curHeight += upSpeed;
        if(desiredHeight <= curHeight) 
        {
            day = i;
            break;
        }
        curHeight -= downSpeed;
    }
    return day;
}
