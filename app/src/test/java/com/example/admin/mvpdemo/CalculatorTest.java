package com.example.admin.mvpdemo;

import com.example.admin.mvpdemo.main.Calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;


@RunWith(JUnit4.class)
public class CalculatorTest {

    @Test
   public void testAdd(){
        int expected = 40;
        int actual = Calculator.add(10,20);
        assertEquals(expected,actual);
    }
}
