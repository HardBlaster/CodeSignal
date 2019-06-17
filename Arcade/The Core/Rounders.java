int rounders(int n) {
    int num = 10;
  while (n > num) {
    if ((n % num)/(num / 10) < 5)
      n = (n/num) * num;
    else
      n =  (n/num+1) * num ;
    num *= 10;
  }
  return n;
}
