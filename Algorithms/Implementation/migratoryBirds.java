/* Link to challenge: https://www.hackerrank.com/challenges/migratory-birds/problem */

static int migratoryBirds(List<Integer> arr) {
  int[] store = {1,2,3,4,5};
  int[] occurrences = {0,0,0,0,0};
  for(int i = 0; i < arr.size(); i++) {
    occurrences[arr.get(i) - 1] += 1;
  }
  int min = 0;
  int temp = 0;
  for(int i = 0; i < occurrences.length; i++) {
    if(occurrences[i] > temp) {
      min = store[i];
      temp = occurrences[i];
    }
  }
  return min;
}
