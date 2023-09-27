public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    // Primitives types
    int age = 30;
    double height = 1.75;
    boolean married = true;
    System.out.println("Primitive type: ");

    age += 10;


    System.out.println(age);
    System.out.println(height);
    System.out.println(married);
    

    // Wrappers types
    Integer ageW = 30;
    Double heightW = 1.75;
    Boolean marriedW = true;
    System.out.println("Wrapper type: ");
    System.out.println(ageW);
    System.out.println(heightW);
    System.out.println(marriedW);

    final double PI = 3.14;
    System.out.println(PI);

  }
}
