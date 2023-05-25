public class Main {
    public static void main(String[] args) {

        /** a kelimelerin harf sayıları eşit ama "a" ve "ı" harfleri birbirinden farklı.
         * Bu yüzden anagram değil.
         * -balıkçı
         * -bıçakla
         */


        /**
         Function is_anagram(word1, word2):
         if length of word1 <> length of word2:
         return False

         word1_letter_counter = create a new empty dictionary
         word2_letter_counter = create a new empty dictionary

         for each letter in word1:
         if letter exists in word1_letter_counter:
         word1_letter_counter[letter] += 1
         else:
         word1_letter_counter[letter] = 1

         for each letter in word2:
         if letter exists in word2_letter_counter:
         word2_letter_counter[letter] += 1
         else:
         word2_letter_counter[letter] = 1

         if word1_letter_counter is equal to word2_letter_counter:
         return True
         else:
         return False

         */

        System.out.println(AnagramChecker.areAnagrams("Balikci","Bicakla") ? "Anagram" : "Not Anagram");

    }

}