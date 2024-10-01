import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new java.util.HashMap<>();
        map.put(1, map.getOrDefault(1, 0) + 1);
        System.out.println("FreakyBob\n");
        int b = 3;
        if (b <= 4) {
            System.out.println("not real");
        }
    }
}
