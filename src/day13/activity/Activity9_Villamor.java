package day13.activity;

import java.util.Arrays;
import java.util.Scanner;

public class Activity9_Villamor {
    static void main(String[] args) {
        String country = "Philippines";



        // ---- Research Phase: 10 String methods ----
        String text = "Hello, World";

        // 1. contains() - true if the string holds the given sequence of characters
        System.out.println("contains(\"World\")   -> " + text.contains("World"));

        // 2. endsWith() - true if the string ends with the given suffix
        System.out.println("endsWith(\"World\")   -> " + text.endsWith("World"));

        // 3. startsWith() - true if the string starts with the given prefix
        System.out.println("startsWith(\"Hello\") -> " + text.startsWith("Hello"));

        // 4. indexOf() - index of the first occurrence, or -1 if not found
        System.out.println("indexOf(\"o\")        -> " + text.indexOf("o"));

        // 5. isEmpty() - true only if the string has length 0
        System.out.println("isEmpty()           -> " + text.isEmpty());

        // 6. trim() - removes leading and trailing whitespace
        String padded = "   spaced   ";
        System.out.println("trim()              -> \"" + padded.trim() + "\"");

        // 7. replace() - returns a new string with every old char/sequence swapped
        System.out.println("replace('l','L')    -> " + text.replace('l', 'L'));

        // 8. toCharArray() - breaks the string into a char[] array
        char[] chars = text.toCharArray();
        System.out.println("toCharArray()       -> " + Arrays.toString(chars));

        // 9. nextLine().charAt() - read a full line of input, then grab one character
        //    (Scanner is fed a fixed string here so the demo runs without typing.)
        Scanner scanner = new Scanner("Java Programming");
        char firstChar = scanner.nextLine().charAt(0);
        System.out.println("nextLine().charAt(0)-> " + firstChar);

        // 10. valueOf() - converts other data types (int, boolean, char...) into a String
        int number = 2026;
        String asText = String.valueOf(number);
        System.out.println("valueOf(2026)       -> \"" + asText + "\" (length " + asText.length() + ")");

        System.out.println("\n==============");

        // ---- Stretch Goal ----
        System.out.println(getFirstLetter(country));
        System.out.println(getlastLetter(country));
        System.out.println(getSameLetter(country));
        System.out.println(getTotalVowels(country));
        System.out.println(getTotalVowelsRegex(country));
        System.out.println(getSameLetterRegex(country));

        System.out.println("\n==============");

    }

    public static char getFirstLetter(String word){
        return  word.charAt(0);
    }

    public static char getlastLetter(String word){
        int wordLength = word.length();
        return word.charAt(wordLength-1);
    }

    public static String getSameLetter(String word){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c == 'P' || c == 'p') {
                count++;
            }
        }
        return "'P/p' appears " + count + " time(s)";
    }

    public static String getTotalVowels(String word){
        int count = 0;
        StringBuilder vowels = new StringBuilder();   // holds the vowels we find
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            char lower = Character.toLowerCase(c);    // so 'A' matches 'a'

            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                vowels.append(c); // Keeps original case
                count++;
            }
        }
        return word + " has " + count + " vowel(s): " + vowels;
    }

    public static String getTotalVowelsRegex(String word){
        // remove every character that is NOT a vowel; what's left are the vowels
        String vowels = word.replaceAll("[^aeiouAEIOU]", "");
        int count = vowels.length();
        return word + " has " + count + " vowel(s): " + vowels + " (regex)";
    }

    public static String getSameLetterRegex(String word){
        String letterP = word.replaceAll("[^pP]", "");
        int count = letterP.length();
        return "'P/p' appears " + count + " time(s): " + letterP + " (regex)";
    }


}
