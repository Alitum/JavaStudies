public class App {
    public static void main(String[] args) throws Exception {
        int integer1 = 10;
        int integer2 = 20;
        double double1 = 50.0;
        double double2 = 40.0;
        float float1 = 100.01f;
        float float2 = 100.1f;

        System.out.println(compareNumber(integer1, integer2));
        System.out.println(compareNumber(double1, double2));
        System.out.println(compareNumber(float1, float2));
    }

    public static <T extends Number> double compareNumber(T a, T b) {
        if (a.doubleValue() > b.doubleValue()) {
            return a.doubleValue();
        } else {
            return b.doubleValue();
        }
    }

}
