package com.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {

    ValidParenthesis validParenthesis;
    @BeforeEach
    void setUp() {
        validParenthesis=new ValidParenthesis();
    }

    @Test
    public void test1(){
        Assertions.assertEquals(true, validParenthesis.isValid("()"));
    }
}