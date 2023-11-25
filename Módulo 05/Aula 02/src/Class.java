import java.util.*;

public class Class {
  private Map<String, Double> students = new HashMap<>();

  public void addStudent(String name, double grade, int Age) throws InvalidAgeException {
    if (Age < 12) {
      throw new InvalidAgeException("Students must be at least 12 years old");
    }
    students.put(name, grade);
  }

  public void obtainClassAverage() {
    int amnt = students.size();
    if (amnt == 0) {
      throw new DivisionByZeroException("The class does not have any students");
    } else {
      double sum = 0;
      for (double grade : students.values()) {
        sum += grade;
      }
      double average = sum / amnt;
      System.out.println(average);
    }
  }
}
