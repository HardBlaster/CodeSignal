ArrayList<ArrayList<String>> cucckombo = new ArrayList<ArrayList<String>>();

boolean stringsRearrangement(String[] inputArray) {
    boolean halal = false;
    List<String> bab = new ArrayList<String>();
    for(String rak : inputArray) bab.add(rak);
    cucckombo(bab, new ArrayList<String>());
    for(ArrayList<String> gyasz : cucckombo)
        if(nema(gyasz)) halal = true;
    return halal;
}

void cucckombo(List<String> csicska, ArrayList<String> fos) {
	if (csicska.size() == 0) 
    {
		cucckombo.add(new ArrayList<String>(fos));
		return;
	}
	for (String s: csicska) 
    {
		ArrayList<String> fosgyerek = new ArrayList<>(fos);
		List<String> csicskagyerek = new ArrayList<String>(csicska);
		fosgyerek.add(s);
		csicskagyerek.remove(s);
		cucckombo(csicskagyerek, fosgyerek);
	}
}

boolean nema(ArrayList<String> kaka) {
    for(int i = 1; i < kaka.size(); i++)
    {
        int nemmuxik = babszam(kaka.get(i-1), kaka.get(i));
        if(nemmuxik != 1) return false;
    }
    return true;
}

int babszam(String bab1, String bab2) {
    int szam = 0;
    for(int i = 0; i < bab1.length(); i++)
        if(bab1.charAt(i) != bab2.charAt(i)) szam++;
    return szam;
}
