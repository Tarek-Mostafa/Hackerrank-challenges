static void countApplesAndOranges(int starting_point, int ending_point, int apple_tree_loc, int orange_tree_loc, int[] apples, int[] oranges) {
    int landed_apples = 0;
    int landed_oranges = 0;
    
    for(int i = 0, len = apples.length; i < len; i++) {
      int new_position = apples[i] + apple_tree_loc;
      if(new_position >= starting_point && new_position <= ending_point)
        landed_apples += 1;
    }

    for(int i = 0, len = oranges.length; i < len; i++) {
      int new_position = oranges[i] + orange_tree_loc;
      if(new_position >= starting_point && new_position <= ending_point)
        landed_oranges += 1;
    }

    System.out.println(landed_apples);
    System.out.println(landed_oranges);
}
