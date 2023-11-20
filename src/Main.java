import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(n -> n % 2 != 0) // 奇数のみ
                .map(n -> n * 2)         // 倍にする
                .forEach(System.out::println);
    }
}