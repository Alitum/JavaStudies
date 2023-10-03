public class Class {
  private int identifier;
  Student student01 = null;
  Student student02 = null;
  Student student03 = null;
  Student student04 = null;
  Student student05 = null;

  public Class(int identifier) {
    this.identifier = identifier;
  }

  @Override
  public String toString() {
    return "Class [identifier=" + identifier + ", student01=" + student01 + ", student02=" + student02 + ", student03="
        + student03 + ", student04=" + student04 + ", student05=" + student05 + "]";
  }

  public void addStudent(Student student) {
    if (student01 == null) {
      this.student01 = student;
      return;
    } else if (student02 == null) {
      this.student02 = student;
      return;
    } else if (student03 == null) {
      this.student03 = student;
      return;
    } else if (student04 == null) {
      this.student04 = student;
      return;
    } else if (student05 == null) {
      this.student05 = student;
      return;
    } else {
      System.out.println("The class is full");
    }
  }

  public int getAmtStudents() {
    int i = 0;
    if (student01 != null) {
      i++;
    }
    if (student02 != null) {
      i++;
    }
    if (student03 != null) {
      i++;
    }
    if (student04 != null) {
      i++;
    }
    if (student05 != null) {
      i++;
    }
    return i;
  }

  public double getClassAverage() {
    int i = 0;
    double n = 0;
    if (student01 != null) {
      i++;
      n += student01.getAverage();
    }
    if (student02 != null) {
      i++;
      n += student02.getAverage();
    }
    if (student03 != null) {
      i++;
      n += student03.getAverage();
    }
    if (student04 != null) {
      i++;
      n += student04.getAverage();
    }
    if (student05 != null) {
      i++;
      n += student05.getAverage();
    }
    return n / i;
  }
}
