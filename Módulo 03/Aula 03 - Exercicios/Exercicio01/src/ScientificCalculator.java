public class ScientificCalculator implements Calculator {
  @Override
  public double sum(double a, double b) {
    return a + b;
  }

  @Override
  public double sub(double a, double b) {
    return a - b;
  }

  @Override
  public double mul(double a, double b) {
    return a * b;
  }

  @Override
  public double div(double a, double b) {
    return a / b;
  }

  public double sqrRoot(double a) {
    return Math.sqrt(a);
  }

  public double power(double a, double b) {
    return Math.pow(a, b);
  }
}
