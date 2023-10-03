public class Teacher {
  private String name;
  private String discipline;

  public Teacher(String name, String discipline) {
    this.name = name;
    this.discipline = discipline;

  }

  @Override
  public String toString() {
    return "Teacher [name=" + name + ", discipline=" + discipline + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((discipline == null) ? 0 : discipline.hashCode());
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
    Teacher other = (Teacher) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (discipline == null) {
      if (other.discipline != null)
        return false;
    } else if (!discipline.equals(other.discipline))
      return false;
    return true;
  }

}
