public class Student {
  private String name;
  private int age;
  private String registration;
  private double average;

  public Student(String name, int age, String registration, double average) {
    this.name = name;
    this.age = age;
    this.registration = registration;
    this.average = average;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }

  public double getAverage() {
    return average;
  }

  public void setAverage(double average) {
    this.average = average;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + ", registration=" + registration + ", average=" + average + "]";
  }

}
