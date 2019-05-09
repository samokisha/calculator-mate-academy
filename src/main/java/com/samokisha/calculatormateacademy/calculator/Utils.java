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

    public static NumberType parseNumberType(String value) throws Exception {
        if (isInteger(value)) {
            return NumberType.ARABIC;
        }

        if (isRomanNumber(value)) {
            return NumberType.ROMAN;
        }

        throw new Exception(value + " is not arabic or roman number");
    }

    public static boolean isRomanNumber(String value) {
        try {
            parseRomanNumber(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Integer parseRomanNumber(String value) throws Exception {
        String normalizeVal = value.trim().toUpperCase();

        if (normalizeVal.isEmpty()) {
            return 0;
        } else if (normalizeVal.startsWith("M")) {
            return 1000 + parseRomanNumber(normalizeVal.substring(1));
        } else if (normalizeVal.startsWith("CM")) {
            return 900 + parseRomanNumber(normalizeVal.substring(2));
        } else if (normalizeVal.startsWith("D")) {
            return 500 + parseRomanNumber(normalizeVal.substring(1));
        } else if (normalizeVal.startsWith("CD")) {
            return 400 + parseRomanNumber(normalizeVal.substring(2));
        } else if (normalizeVal.startsWith("C")) {
            return 100 + parseRomanNumber(normalizeVal.substring(1));
        } else if (normalizeVal.startsWith("XC")) {
            return 90 + parseRomanNumber(normalizeVal.substring(2));
        } else if (normalizeVal.startsWith("L")) {
            return 50 + parseRomanNumber(normalizeVal.substring(1));
        } else if (normalizeVal.startsWith("XL")) {
            return 40 + parseRomanNumber(normalizeVal.substring(2));
        } else if (normalizeVal.startsWith("X")) {
            return 10 + parseRomanNumber(normalizeVal.substring(1));
        } else if (normalizeVal.startsWith("V") || normalizeVal.startsWith("I")) {
            return ROMAN_NUMS.indexOf(normalizeVal) + 1;
        } else {
            throw new Exception("Is not roman number!");
        }
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
