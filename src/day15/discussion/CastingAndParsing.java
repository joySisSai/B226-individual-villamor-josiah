package day15.discussion;

/*
Casting and Parsing

Casting  - converting one NUMBER type to another number type (int, double, etc.)
Parsing  - converting a STRING (text) into a number
 */
public class CastingAndParsing {
    static void main(String[] args) {

        // ---------- CASTING ----------

        // Upcasting / Widening (automatic) - small type to big type, no data loss
        // byte -> short -> int -> long -> float -> double
        int wholeNumber = 5;
        double upcasted = wholeNumber; // 5.0 - no cast needed, Java does it for you
        System.out.println("Upcasting: " + upcasted);

        // Downcasting / Narrowing (explicit) - big type to small type, may lose data
        // double -> float -> long -> int -> short -> byte
        double price = 9.99;
        int downcasted = (int) price; // 9 - decimals chopped off, NOT rounded
        System.out.println("Downcasting: " + downcasted);

        // Downcasting can overflow when the value doesn't fit the smaller type
        int big = 130;
        byte overflowed = (byte) big; // -126, because byte only holds -128 to 127
        System.out.println("Overflow: " + overflowed);

        // ---------- PARSING ----------

        // String to int
        String textNumber = "58";
        int parsedInt = Integer.parseInt(textNumber);
        System.out.println("Parsed int: " + (parsedInt + 2)); // 60 - math works now

        // String to double
        String textDecimal = "5.5";
        double parsedDouble = Double.parseDouble(textDecimal);
        System.out.println("Parsed double: " + parsedDouble);

        // The reverse: number to String
        String backToText = String.valueOf(58);
        System.out.println("Back to String: " + backToText + 1); // "581" - text join, not math
    }
}
