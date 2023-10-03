public class Example {
  private String value = "Random value";

  public String getVariableStatic() {
    return value;
  }

  public void setVariableStatic(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Example [value=" + value + "]";
  }

}
