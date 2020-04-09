package chapter7.item42;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("55555", "333", "1", "4444", "22");

        Collections.sort(words,
                (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() > o2.length() ? 1 : 0;
            }
        });

        System.out.println(words);
    }
}
