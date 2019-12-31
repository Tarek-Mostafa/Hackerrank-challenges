// Link to challenge: https://www.hackerrank.com/challenges/counting-valleys/problem

static int countingValleys(int n, String s) {
  int level = 0;
  int valleys = 0;
  for(int i = 0; i < s.length(); i++) {
    if(s.charAt(i) == 'U')
      level++;
    else if(s.charAt(i) == 'D')
      level--;
    if(level == 0 && s.charAt(i) == 'U')
      valleys++;
  }
  return valleys;
}
