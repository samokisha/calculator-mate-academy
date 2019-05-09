package com.samokisha.calculatormateacademy.calculator;

public class Operand {

    private Integer value;

    public Operand(String value) {
        if (Utils.isInteger(value)) {
            this.value = Integer.parseInt(value);
        } else if (Utils.isRomanNumber(value)) {
            this.value = Utils.parseRomanNumber(value);
        }
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
