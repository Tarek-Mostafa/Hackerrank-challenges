/* Link to challenge: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem */

static int[] breakingRecords(int[] scores) {
      int lowest = scores[0];
      int highest = scores[0];
      int broke_lowest = 0;
      int broke_highest = 0;

      for(int i = 0; i < scores.length; i++) {
        if(scores[i] < lowest) {
          broke_lowest++;
          lowest = scores[i];
        }
        else if(scores[i] > highest) {
          broke_highest++;
          highest = scores[i];
        }
      }

      return(new int[] {broke_highest, broke_lowest});
}
