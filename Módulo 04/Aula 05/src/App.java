import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, String> classMap = new HashMap<>();

        classMap.put("000.000.111-33", "Fulano");
        classMap.put("000.000.123-56", "Beltrano");

        System.out.println(classMap);

        System.out.println(classMap.containsKey("000.000.123-56"));
        System.out.println(classMap.containsValue("Fulano"));
        System.out.println(classMap.get("000.000.123-56"));
        System.out.println(classMap.keySet());

    }
}
