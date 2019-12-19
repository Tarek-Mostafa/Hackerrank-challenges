// Link to challenge: https://www.hackerrank.com/challenges/sock-merchant/problem

static int sockMerchant(int n, int[] ar) {
  int numOfMatchingSocks = 0;
  int[] store = new int[101];
  for(int i = 1; i <= n; i++) {
    store[ar[i - 1]] += 1;
  }

  for(int i = 0; i < store.length; i++) {
    if(store[i] >= 2) {
      numOfMatchingSocks += Math.floor(store[i] / 2);
    }
  }
  return numOfMatchingSocks;
}
