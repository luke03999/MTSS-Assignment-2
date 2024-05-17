package it.unipd.mtss;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;


public class IntegerToRomanTest extends TestCase
{
    @Test
    public void testIntegerToRomanDefaultCase()
    {
        IntegerToRoman converter = new IntegerToRoman();

        assertEquals("M", converter.convert(1000));
        assertEquals("CM", converter.convert(900));
        assertEquals( "D", converter.convert(500));
        assertEquals( "CD", converter.convert(400));
        assertEquals( "C", converter.convert(100));
        assertEquals( "XC", converter.convert(90));
        assertEquals( "L", converter.convert(50));
        assertEquals("XL", converter.convert(40));
        assertEquals( "X", converter.convert(10));
        assertEquals( "IX", converter.convert(9));
        assertEquals( "V", converter.convert(5));
        assertEquals( "IV", converter.convert(4));
        assertEquals( "I", converter.convert(1));
    }


    @Test
    public void testIntegerToRomanFirstThreeNumber()
    {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals( "II", converter.convert(2));
        assertEquals( "III", converter.convert(3));
    }

    @Test
    public void testIntegerToRomanSixThreeNumber()
    {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals( "VI", converter.convert(6));
    }


    @Test
    public void testIntegerToRomanFirstTwentyNumber()
    {
        IntegerToRoman converter = new IntegerToRoman();

        assertEquals( "XV", converter.convert(15));
        assertEquals( "XIX", converter.convert(19));
        assertEquals( "XX", converter.convert(20));
    }


    @Test
    public void testIntegerToRomanFirstFiftyNumber()
    {
        IntegerToRoman converter = new IntegerToRoman();

        assertEquals( "XXIX", converter.convert(29));
        assertEquals( "XXXIX", converter.convert(39));
        assertEquals( "XLV", converter.convert(45));
        assertEquals( "XLIX", converter.convert(49));
    }

    @Test
    public void testIntegerToRomanFirstHundredNumber()
    {
        IntegerToRoman converter = new IntegerToRoman();

        assertEquals( "LI", converter.convert(51));
        assertEquals( "LX", converter.convert(60));
        assertEquals( "LXXXIX", converter.convert(89));
        assertEquals( "XCIX", converter.convert(99));
    }

    @Test
    public void testIntegerToRomanFirstFiveHundredNumber()
    {
        IntegerToRoman converter = new IntegerToRoman();

        assertEquals( "CII", converter.convert(102));
        assertEquals( "CCC", converter.convert(300));
        assertEquals( "CCCXCIX", converter.convert(399));
        assertEquals( "CDXCIX", converter.convert(499));
    }

    @Test
    public void testIntegerToRomanFirstThousandNumber()
    {
        IntegerToRoman converter = new IntegerToRoman();

        assertEquals( "DIII", converter.convert(503));
        assertEquals( "DCCCXCIX", converter.convert(899));
        assertEquals( "CMXCIX", converter.convert(999));
    }

    @Test
    public void testIntegerToRomanNumberZero()
    {
        IntegerToRoman conv = new IntegerToRoman();
        boolean thrown = false;

        try {
            conv.convert(0);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }

    @Test
    public void testIntegerToRomanNumberNegativeNumber()
    {
        IntegerToRoman conv = new IntegerToRoman();
        boolean thrown = false;

        try {
            conv.convert(-20);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testIntegerToRomanNumberOutOfBound()
    {
        IntegerToRoman conv = new IntegerToRoman();
        boolean thrown = false;

        try {
            conv.convert(2000);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }
}
