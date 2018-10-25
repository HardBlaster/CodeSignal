int depositProfit(int deposit, int rate, int threshold) {
  double d = deposit;
  double t = threshold;
  int year = 0;
  while (d < t) 
  {
    d += d * rate/100;
    year ++;
  }
  return year;
}
