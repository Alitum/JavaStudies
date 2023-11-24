import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Course {
  protected String name;
  protected String teacher;
  protected Set<String> discipline = new HashSet<>();
  protected Map<String, String> students = new HashMap<>();

  public Course(String name, String teacher) {
    this.name = name;
    this.teacher = teacher;
  }

  public void addDiscipline(String discipline) {
    this.discipline.add(discipline);
  }

  public void removeDiscipline(String discipline) {
    this.discipline.remove(discipline);
  }

  public void addStudent(String registration, String name) {
    this.students.put(registration, name);
  }

  public void removeStudent(String registration, String name) {
    this.students.remove(registration, name);
  }

  public boolean hasStudent(String name) {
    return this.students.containsValue(name);
  }

  @Override
  public String toString() {
    return "COURSE DETAILS\nCourse name: " + name + "\nTeacher name: " + teacher + "\nDisciplines: " + discipline
        + "\nTotal students: " + students.size()
        + "\nStudents:"
        + students;
  }

}
