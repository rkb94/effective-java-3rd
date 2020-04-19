package chapter7.item42;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("55555", "333", "1", "4444", "22");

        // 람다 형식
        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // Functional Interface Comparator를 이용한 sort
        Comparator<String> comparator1 = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        Comparator<String> comparator2 = Comparator.comparingInt(String::length);

        words.sort(comparator2);

        // 기존 익명클래스 형식
//        words.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() > o2.length() ? 1 : 0;
//            }
//        });

        System.out.println(words);
    }
}
