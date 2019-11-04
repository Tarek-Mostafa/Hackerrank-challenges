/* Link to challenge on hackerrank: https://www.hackerrank.com/challenges/staircase/problem */
static void staircase(int n) {
  for(int i = 0; i < n; i++) {
    for(int space = 0; space < n - 1 - i; space++) {
      System.out.print(" ");
    }

    for(int space = 0; space <= i; space++) {
      System.out.print("#");
    }
    System.out.print("\n");
  }
}
