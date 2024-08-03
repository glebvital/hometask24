package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringsTest {
    private Strings strings = new Strings();
    @Test
    public void wordcount() {
        int result = strings.wordcount("hello");
        assertEquals(1,result);
    }

    @Test
    public void reverse() {
        String result = strings.Reverse("hello");
        assertEquals("olleh",result);
    }

    @Test
    public void q2() {
        int result = strings.Q2("hello");
        assertEquals(2,result);
    }

    @Test
    public void q3() {
        boolean result = strings.Q3("hello");
        assertEquals(true,result);
    }

    @Test
    public void q4() {
        String result = strings.Q4("hello");
        assertEquals("hello",result);
    }

    @Test
    public void q5() {
        String[] result = strings.Q5("hello friend");
        assertEquals("hello",result[0]);
    }

    @Test
    public void q6() {
        String result = strings.Reverse("hello");
        assertEquals("olle",result);
    }

    @Test
    public void q7() {
        String result = strings.Q7("hello friend");
        assertEquals("Hello friend",result);
    }

    @Test
    public void q8() {
        boolean result = strings.Q8("ban","nab");
        assertEquals(true,result);
    }
}