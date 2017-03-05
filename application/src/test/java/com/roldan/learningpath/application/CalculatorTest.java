package com.roldan.learningpath.application;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testOnePlusOneEqualsTwo() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.sum(1, 1));
    }
}
