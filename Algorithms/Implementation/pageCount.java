// Link to challenge: https://www.hackerrank.com/challenges/drawing-book/problem

static int pageCount(int n, int p) {
  int startToEnd = (int) Math.floor(p / 2);
  int endToStart = (int) Math.ceil((n / 2) - (p/2));
  return( Math.min(startToEnd, endToStart) );
}
