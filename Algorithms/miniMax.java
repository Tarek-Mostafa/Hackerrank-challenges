/* Link to challenge on Hackerrank: https://www.hackerrank.com/challenges/mini-max-sum/problem */

static void miniMaxSum(int[] arr) {
  long min = Arrays.stream(arr).min().getAsInt();
  long max = Arrays.stream(arr).max().getAsInt();

  long minSum = 0;
  long maxSum = 0;

  if(min != max) {
    for(int i = 0, len = arr.length; i < len; i++) {
      if (arr[i] == min)
        continue;
      else
        maxSum += arr[i];
    }

    for(int i = 0, len = arr.length; i < len; i++) {
      if (arr[i] == max)
        continue;
      else
        minSum += arr[i];
    }
  } else {
    for(int i = 0, len = arr.length; i < len-1; i++) {
        minSum += arr[i];
        maxSum += arr[i];
    }
  }

  System.out.println(minSum + " " + maxSum);
}
