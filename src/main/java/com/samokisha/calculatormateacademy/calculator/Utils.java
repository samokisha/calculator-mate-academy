package com.samokisha.calculatormateacademy.calculator;

import java.util.Arrays;
import java.util.List;

public class Utils {

    private static final List<String> ROMAN_NUMS = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

    public static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static NumberType parseNumberType(String value) {
        if (isInteger(value)) {
            return NumberType.ARABIC;
        }

        if (isRomanNumber(value)) {
            return NumberType.ROMAN;
        }

        return null;
    }

    public static boolean isRomanNumber(String value) {
        return ROMAN_NUMS.contains(value.toUpperCase());
    }

    public static Integer parseRomanNumber(String value) {
        return ROMAN_NUMS.indexOf(value.toUpperCase()) + 1;
    }

    public static String arabicToRoman(Integer arabic) {
        if (arabic == 0) {
            return "";
        } else if (arabic < 0) {
            return "-" + arabicToRoman(arabic * -1);
        } else if (arabic >= 1000) {
            return "M" + arabicToRoman(arabic - 1000);
        } else if (arabic >= 900) {
            return "CM" + arabicToRoman(arabic - 900);
        } else if (arabic >= 500) {
            return "D" + arabicToRoman(arabic - 500);
        } else if (arabic >= 400) {
            return "CD" + arabicToRoman(arabic - 400);
        } else if (arabic >= 100) {
            return "C" + arabicToRoman(arabic - 100);
        } else if (arabic >= 90) {
            return "XC" + arabicToRoman(arabic - 90);
        } else if (arabic >= 50) {
            return "L" + arabicToRoman(arabic - 50);
        } else if (arabic >= 40) {
            return "XL" + arabicToRoman(arabic - 40);
        } else if (arabic >= 10) {
            return "X" + arabicToRoman(arabic - 10);
        } else {
            return ROMAN_NUMS.get(arabic - 1);
        }
    }
}
