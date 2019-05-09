package com.samokisha.calculatormateacademy.calculator;

import org.junit.Test;

public class ExpressionTest {

    @Test
    public void parseExpression_splitPlusSymbol() throws Exception {
        Expression.parseExpression("1+1");
    }

    @Test
    public void parseExpression_splitMinusSymbol() throws Exception {
        Expression.parseExpression("1-1");
    }

    @Test
    public void parseExpression_splitMultiplySymbol() throws Exception {
        Expression.parseExpression("1*1");
    }

    @Test
    public void parseExpression_splitDivideSymbol() throws Exception {
        Expression.parseExpression("1/1");
    }
}