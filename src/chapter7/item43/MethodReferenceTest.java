package chapter7.item43;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public static void main(String[] args) {
        String[] arrays = {"1", "2", "3", "4"};

        List<String> list = Arrays.asList(arrays);

        // 반복적인 for문의 사용
        for(String s: list){
            System.out.println(s);
        }

        // forEach 메서드에 람다 사용
        list.forEach(x -> System.out.println(x));

        // forEach 메서드에 메서드 참조 사
        list.forEach(System.out::println);

        Function<String, Integer> function = Integer::parseInt;

        Supplier<String> s = String::new;
        Object test = s.get();
        System.out.println(test.getClass());
        Supplier function2 = TreeMap<String, Integer>::new;
        Supplier func = () -> new TreeMap<String, Integer>();
    }
}
