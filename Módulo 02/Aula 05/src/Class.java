public class Class {
  private int id;
  private int amtStudents;
  private Teacher teacher;

  public Class(int id, int amtStudents, Teacher teacher) {
    this.id = id;
    this.amtStudents = amtStudents;
    this.teacher = teacher;
  }

  @Override
  public String toString() {
    return "Class [id=" + id + ", amtStudents=" + amtStudents + ", teacher=" + teacher + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + amtStudents;
    result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Class other = (Class) obj;
    if (id != other.id)
      return false;
    if (amtStudents != other.amtStudents)
      return false;
    if (teacher == null) {
      if (other.teacher != null)
        return false;
    } else if (!teacher.equals(other.teacher))
      return false;
    return true;
  }

}
