package java8;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FibWithCache {
    private static  Map<Long, BigInteger> cache = new HashMap<>();
    public static  BigInteger fib(long i) {
        if (i == 0) return BigInteger.ZERO; if (i == 1) return BigInteger.ONE;
        return cache.computeIfAbsent(i, n -> fib(n - 2).add(fib(n - 1))); }



    public static void main (String[] argv)    {
        FibWithCache fibWithCache = new FibWithCache();
        System.out.println("Get the fib value 1 " + fib(1));
        System.out.println("Get the fib value 1 " + fib(5));
        System.out.println("Get the fib value 1 " + fib(7));
        String passage = "NSA agent walks into a bar. Bartender says, " +
                "'Hey, I have a new joke joke joke for you.' Agent says, 'heard it'.";
        Map<String, Integer> counts = fibWithCache.countWords(passage, "NSA", "agent", "joke");
        counts.forEach((word, count) -> System.out.println(word + "=" + count));

    }
    public Map<String,Integer> countWords(String passage, String... strings) { Map<String, Integer> wordCounts = new HashMap<>();
        Arrays.stream(strings).forEach(s -> wordCounts.put(s, 0));
        Arrays.stream(passage.split(" ")).forEach(word ->
                wordCounts.computeIfPresent(word, (key, val) -> val + 1)); return wordCounts;
    }


}
