int magicalWell(int a, int b, int n) {
    int money = 0;
    for(int i = n; i > 0; i--)
        money += (a++)*(b++);
    return money;
}
