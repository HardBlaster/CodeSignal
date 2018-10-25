String[] fileNaming(String[] names) {
    HashSet<String> kaka = new HashSet<String>();
    for(int i = 0; i < names.length; i++)
    {
        if(kaka.add(names[i])) continue;
        else 
        {
           for(int j = 1; j < 16; j++)
           {
               String bab = names[i] + '(' + j + ')';
               if(kaka.add(bab))
               {
                   names[i] = bab;
                   break;
               }
           }
        }
    }
    return names;
}
