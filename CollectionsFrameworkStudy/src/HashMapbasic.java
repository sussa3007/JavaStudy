import java.util.HashMap;


public class HashMapbasic {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);

        System.out.println(a);


        a.put("one",5);
        System.out.println(a);

        }
}

