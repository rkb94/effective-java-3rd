package chapter7.item45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        File dictionary = new File("src/chapter7/item45/anagrams.txt");
        int minGroupSize = 4;

        Map<String, Set<String>> groups = new HashMap<>();
        try (Scanner s = new Scanner(dictionary)) {
            while (s.hasNext()) {
                String word = s.next();
                groups.computeIfAbsent(alphabetize(word), (unused) -> new TreeSet<>()).add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (Set<String> group : groups.values()) {
            if (group.size() >= minGroupSize)
                System.out.println(group.size() + ": " + group);
        }
    }
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
