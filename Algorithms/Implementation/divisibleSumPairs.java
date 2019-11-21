/* Link to challenge: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem */

static int divisibleSumPairs(int n, int k, int[] ar) {
    int numOfPairs = 0;
    for(int i = 0; i < ar.length; i++) {
        for(int j = 0; j < ar.length; j++) {
            if(i < j && (ar[i] + ar[j]) % k == 0)
                numOfPairs++;
        }
    }
    return numOfPairs;
}
