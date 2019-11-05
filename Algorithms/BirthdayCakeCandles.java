/* Link to challenge on hackerrank: https://www.hackerrank.com/challenges/birthday-cake-candles/problem */

static int birthdayCakeCandles(int[] ar) {
  int max = findMax(ar);
  int count = 0;

  for(int i = 0, len = ar.length; i < len; i++) {
    if(ar[i] == max) {
      count++;
    }
  }
  return count;
}

static int findMax(int[] ar) {
  int max = 0;
  for(int i = 0, len = ar.length; i < len; i++) {
    if(ar[i] > max) {
      max = ar[i];
    }
  }
  return max;
}
