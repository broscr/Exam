import java.util.*;
public class AnagramChecker {

    private static final Map<Character, Integer> primeNumberMap = new HashMap<>();

    // İlk 26 asal sayı
    private static final int[] primeNumbers = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
            31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
            73, 79, 83, 89, 97, 101
    };

    // Harf-sayı eşleştirmelerini Map'e ekleme
    static {
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            primeNumberMap.put(c, primeNumbers[i]);
        }
    }

    // Bir kelimenin harflerinin çarpımını hesaplayan metot
    private static long calculateProduct(String word) {
        long product = 1;
        for (char c : word.toCharArray()) {
            // Harf-sayı eşleştirmesini kullanarak harf için asal sayıyı bulma
            Integer primeNumber = primeNumberMap.get(Character.toLowerCase(c));
            if (primeNumber != null) {
                product *= primeNumber;
            }
        }
        return product;
    }

    // İki kelimenin anagram olup olmadığını kontrol eder
    public static boolean areAnagrams(String word1, String word2) {
        return calculateProduct(word1) == calculateProduct(word2);
    }
}