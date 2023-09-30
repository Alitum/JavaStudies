import java.util.Objects;

public class Student {
  private long registration;
  private String name;

  public Student(long registration, String name) {
    this.registration = registration;
    this.name = name;
  }

  public String toString() {
    return "Student [registration: " + this.registration + " - name: " + this.name + "]";
  }

  public boolean equals(Student other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    return Objects.equals(this.registration, other.registration) && Objects.equals(this.name, other.name);
  }

  public int hashCode() {
    return Objects.hash(this.registration, this.name);
  }
}
