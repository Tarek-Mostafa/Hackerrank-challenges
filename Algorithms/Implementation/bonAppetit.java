// Link to challenge: https://www.hackerrank.com/challenges/bon-appetit/problem

static void bonAppetit(List<Integer> bill, int k, int b) {
  int amountToBePainByAnna = 0;
  for(int i = 0; i < bill.size(); i++) {
    if(i == k)
      continue;
    amountToBePainByAnna += bill.get(i);
  }
  amountToBePainByAnna /= 2;
  if (amountToBePainByAnna == b) 
    System.out.println("Bon Appetit");
  else
    System.out.println(b - amountToBePainByAnna);
}
