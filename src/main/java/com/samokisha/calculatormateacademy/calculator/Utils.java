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
        return ROMAN_NUMS.indexOf(value) + 1;
    }
}
