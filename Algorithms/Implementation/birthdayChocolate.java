/* Link to Challenge: https://www.hackerrank.com/challenges/the-birthday-bar/problem */
static int birthday(List<Integer> s, int d, int m) {
  int howMany = 0;
  for(int i = 0, len = s.size(); i < len; i++) {
    int sum = 0;
    for(int j = i; j < i+m; j++) {
      if(j < len) sum += s.get(j);
    }
    if(sum == d) howMany++;
  }
  return howMany;
}
