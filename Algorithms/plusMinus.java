/* Link to challenge on hackerrank: https://www.hackerrank.com/challenges/plus-minus/problem */
static void plusMinus(int[] arr) {
    int arrLength = arr.length;
    int positives, negatives, zeros;
    positives = negatives = zeros = 0;

    for(int i = 0; i < arrLength; i++) {
        if(arr[i] > 0)
            positives++;
        else if (arr[i] < 0)
            negatives++;
        else
            zeros++;
    }

    System.out.println((double) positives / arrLength);
    System.out.println((double) negatives / arrLength);
    System.out.println((double) zeros / arrLength);
}
