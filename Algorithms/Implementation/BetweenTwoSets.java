/* Link to challenge: https://www.hackerrank.com/challenges/between-two-sets/problem */

public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
      int found = 0;

      int min = Math.min(Collections.min(a), Collections.min(b));
      int max = Math.max(Collections.max(a), Collections.max(b));

      for(int i = min; i <= max; i++) {
        int found_in_first_array = 0;
        int found_in_second_array = 0;

        for(int j = 0; j < a.size(); j++) {
          if(i % a.get(j) == 0) found_in_first_array++;
        }

        for(int k = 0; k < b.size(); k++) {
          if(b.get(k) % i  == 0) found_in_second_array++;
        }

        if(found_in_first_array == a.size() && found_in_second_array == b.size()) {
          found++;
        }
      }
      return found;
    }

}
