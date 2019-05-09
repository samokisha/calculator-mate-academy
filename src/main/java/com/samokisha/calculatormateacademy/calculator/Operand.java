package com.samokisha.calculatormateacademy.calculator;

public class Operand {

    private Integer value;
    private NumberType numberType;

    public Operand(String value) throws Exception {
        if (Utils.isInteger(value)) {
            this.value = Integer.parseInt(value);
            this.numberType = NumberType.ARABIC;
        } else if (Utils.isRomanNumber(value)) {
            this.value = Utils.parseRomanNumber(value);
            this.numberType = NumberType.ROMAN;
        }
    }

    public Integer getValue() {
        return value;
    }

    public NumberType getNumberType() {
        return numberType;
    }
}
