int digitsProduct(int product) {
    if(product < 10)
    {
        if(product > 0) return product;
        else return 10;
    }
    String zsa = "";
    for(int i = 9; i >= 2; i--)
    {
        while(product % i == 0)
        {
            product /= i;
            zsa = Character.toString((char)(i + '0')) + zsa;
        }
    }
    if(product != 1) return -1;
    else return Integer.parseInt(zsa);
}
