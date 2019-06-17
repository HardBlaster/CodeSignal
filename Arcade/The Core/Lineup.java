int lineUp(String commands) {
    int face = 0;
    boolean jo = true;
    for(char c: commands.toCharArray())
    {
        if(c == 'L' || c == 'R')
        {
            if(!jo) face++;
            jo = !jo;
        }
        else if(jo) face++;
    }
    return face;
}
