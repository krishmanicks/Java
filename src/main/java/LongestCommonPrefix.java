package src.main.java;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        List<String> prefixes = Arrays.asList("cluster", "clue", "clutch", "club", "clumsy");

        String strs[] = {"cluster", "clue", "club", "clutch", "clumsy"};
        System.out.println(solve(strs, prefixes.size() - 1));
    }

    private static String solve(String[] prefixes, int size) {
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.sort(prefixes);
        for (int i = 0; i < prefixes[0].toCharArray().length; i++) {
            if (prefixes[0].charAt(i) != prefixes[size].charAt(i)) {
                return stringBuilder.toString();
            }
            stringBuilder.append(prefixes[0].charAt(i));
        }
        return stringBuilder.toString();
    }
}
