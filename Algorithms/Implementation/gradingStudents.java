// Link to challenge: https://www.hackerrank.com/challenges/grading/problem

public static List<Integer> gradingStudents(List<Integer> grades) {
  List<Integer> arr = new ArrayList<>();

  for(int i =  0; i < grades.size(); i++) {
    int nextMultipleOfFive = (grades.get(i) / 5 + 1) * 5;
    int diff = nextMultipleOfFive - grades.get(i);
    if(grades.get(i) % 5 != 0 && diff < 3 && grades.get(i) >= 38) {
      arr.add(nextMultipleOfFive);
    } else {
      arr.add(grades.get(i));
    }
  }
  return arr;
}
