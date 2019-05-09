package com.samokisha.calculatormateacademy.calculator;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void isInteger_forZeroToOneHundred() {
        for (int i = 0; i < 101; i++) {
            assertTrue("Is integer: " + i, Utils.isInteger(String.valueOf(i)));
        }
    }

    @Test
    public void getNumberType_forZeroToOneHundredArabic() {
        for (int i = 0; i < 101; i++) {
            assertEquals(i + " - is arabic number", NumberType.ARABIC, Utils.parseNumberType(String.valueOf(i)));
        }
    }

    @Test
    public void getNumberType_forZeroToOneHundredArabicWithLetter() {
        for (int i = 0; i < 101; i++) {
            assertNull(i + "I - is arabic number", Utils.parseNumberType(i + "I"));
            assertNull("I" + i + " - is arabic number", Utils.parseNumberType("I" + i));
        }
    }

    @Test
    public void getNumberType_forRandomFromMinusOneMillionToOneMillionArabic() {
        Random random = new Random();
        int randInt = random.nextInt(2_000_001);
        assertEquals(
                randInt + " - is arabic number",
                NumberType.ARABIC,
                Utils.parseNumberType(String.valueOf(randInt))
        );
    }

    @Test
    public void getNumberType_forOneToTenRoman() {
        Stream.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X")
                .forEach(i -> assertEquals(i + " - is roman number", NumberType.ROMAN, Utils.parseNumberType(i)));
    }

    @Test
    public void parseRomanNumber_forOneToTenRoman() {
        List<String> romanNums = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

        for (int i = 0; i < romanNums.size(); i++) {
            Integer number = Utils.parseRomanNumber(romanNums.get(i));
            assertEquals(romanNums.get(i) + " roman number equal " + number + " arabic number",
                    new Integer(i + 1),
                    number);
        }
    }
}