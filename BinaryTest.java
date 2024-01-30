package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test with a valid binary value
     */
    @Test
    public void ValidBinary()
    {
		Binary binary = new Binary("10101010");
        assertTrue(binary.getValue().equals("10101010"));
    }
    /**
     * Test with an invalid signed binary value
     */
    @Test
    public void NegativeSignBinary()
    {
		Binary binary = new Binary("-1110100");
        assertTrue(binary.getValue().equals("0"));
    }
    /**
     * Test with an invalid non-binary digits
     */
    @Test
    public void InvalidDigitsBinary()
    {
		Binary binary = new Binary("1051301221");
        assertTrue(binary.getValue().equals("0"));
    }
    /**
     * Test with an invalid non-binary characters
     */
    @Test
    public void InvalidCharsBinary()
    {
		Binary binary = new Binary("101B1E1A");
        assertTrue(binary.getValue().equals("0"));
    }
    /**
     * Test with a zero tailing valid binary value
     */
    @Test
    public void TailingZerosBinary()
    {
		Binary binary = new Binary("00001010");
        assertTrue(binary.getValue().equals("1010"));
    }
    /**
     * Test with an empty string
     */
    @Test
    public void EmptyString()
    {
		Binary binary = new Binary("");
        assertTrue(binary.getValue().equals("0"));
    }
	
    // ADD Test
    /**
     * Test add function for two binary numbers, same length numbers
     */
    @Test
    public void add1()
    {
		Binary binary1 = new Binary("10101");
		Binary binary2 = new Binary("01010");
		Binary binary3 = Binary.add(binary1,binary2);
        assertTrue(binary3.getValue().equals("11111"));
    }
	/**
     * Test add functions for two binary numbers, first number is shorter than the second
     */
    @Test
    public void add2()
    {
		Binary binary1 = new Binary("1011");
		Binary binary2 = new Binary("11111");
		Binary binary3 = Binary.add(binary1,binary2);
        assertTrue(binary3.getValue().equals("101010"));
    }
	/**
     * Test add functions for two binary numbers, first number is larger than the second
     */
    @Test
    public void add3()
    {
		Binary binary1 = new Binary("11111");
		Binary binary2 = new Binary("1010");
		Binary binary3 = Binary.add(binary1,binary2);
        assertTrue(binary3.getValue().equals("101001"));
    }
	/**
     * Test add functions for a binary number and zero
     */
    @Test
    public void add4()
    {
		Binary binary1 = new Binary("0");
		Binary binary2 = new Binary("10101");
		Binary binary3 = Binary.add(binary1,binary2);
        assertTrue(binary3.getValue().equals("10101"));
    }
	/**
     * Test add functions for two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1 = new Binary("0");
		Binary binary2 = new Binary("0");
		Binary binary3 = Binary.add(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    // OR TESTS
    /**
     * Test OR function for two binary numbers, same length numbers
     */
    @Test
    public void or1()
    {
		Binary binary1 = new Binary("10101");
		Binary binary2 = new Binary("01010");
		Binary binary3 = Binary.OR(binary1,binary2);
        assertTrue(binary3.getValue().equals("11111"));
    }
	/**
     * Test OR functions for two binary numbers, first number is larger than the second
     */
    @Test
    public void or2()
    {
		Binary binary1 = new Binary("10000");
		Binary binary2 = new Binary("111");
		Binary binary3 = Binary.OR(binary1,binary2);
        assertTrue(binary3.getValue().equals("10111"));
    }
	/**
     * Test OR functions for two binary numbers, first number is shorter than the second
     */
    @Test
    public void or3()
    {
		Binary binary1 = new Binary("111");
		Binary binary2 = new Binary("10000");
		Binary binary3 = Binary.OR(binary1,binary2);
        assertTrue(binary3.getValue().equals("10111"));
    }
	/**
     * Test OR functions for a binary number and zero
     */
    @Test
    public void or4()
    {
		Binary binary1 = new Binary("0");
		Binary binary2 = new Binary("11111");
		Binary binary3 = Binary.OR(binary1,binary2);
        assertTrue(binary3.getValue().equals("11111"));
    }
	/**
     * Test OR functions for two zeros
     */
    @Test
    public void or5()
    {
		Binary binary1 = new Binary("0");
		Binary binary2 = new Binary("0");
		Binary binary3 = Binary.OR(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    // AND TESTS
    /**
     * Test AND function for two binary numbers, same length numbers
     */
    @Test
    public void and1()
    {
		Binary binary1 = new Binary("10101");
		Binary binary2 = new Binary("11010");
		Binary binary3 = Binary.AND(binary1,binary2);
        assertTrue(binary3.getValue().equals("10000"));
    }
	/**
     * Test AND functions for two binary numbers, first number is shorter than the second
     */
    @Test
    public void and2() 
    {
        Binary binary1  =  new Binary("10");
        Binary binary2  =  new Binary("1110");
        Binary binary3  =  Binary.AND(binary1, binary2);
        assertTrue(binary3.getValue().equals("10"));
    }

	/**
     * Test AND functions for two binary numbers, first number is larger than the second
     */
    @Test
    public void and3()
    {
		Binary binary1 = new Binary("1111");
		Binary binary2 = new Binary("11");
		Binary binary3 = Binary.AND(binary1,binary2);
        assertTrue(binary3.getValue().equals("11"));
    }
	/**
     * Test AND functions for a binary number and zero
     */
    @Test
    public void and4()
    {
		Binary binary1 = new Binary("0");
		Binary binary2 = new Binary("1100");
		Binary binary3 = Binary.AND(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }
	/**
     * Test AND functions for two zeros
     */
    @Test
    public void and5()
    {
		Binary binary1 = new Binary("0");
		Binary binary2 = new Binary("0");
		Binary binary3 = Binary.AND(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    // MULTIPLY TESTS
    /**
     * Test Multiply function for two binary numbers, same length numbers
     */
    @Test
    public void multiply1()
    {
		Binary binary1 = new Binary("10101");
		Binary binary2 = new Binary("01010");
		Binary binary3 = Binary.Multiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("11010010"));
    }
	/**
     * Test Multiply functions for two binary numbers, first number is shorter than the second
     */
    @Test
    public void multiply2() 
    {
        Binary binary1  =  new Binary("101");
        Binary binary2  =  new Binary("10011");
        Binary binary3  =  Binary.Multiply(binary1, binary2);
        assertTrue(binary3.getValue().equals("1011111"));
    }

	/**
     * Test Multiply functions for two binary numbers, first number is larger than the second
     */
    @Test
    public void multiply3()
    {
		Binary binary1 = new Binary("10111");
		Binary binary2 = new Binary("100");
		Binary binary3 = Binary.Multiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("1011100"));
    }
	/**
     * Test Multiply functions for a binary number and zero
     */
    @Test
    public void multiply4()
    {
		Binary binary1 = new Binary("0");
		Binary binary2 = new Binary("1010");
		Binary binary3 = Binary.Multiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }
	/**
     * Test Multiply functions for two zeros
     */
    @Test
    public void multiply5()
    {
		Binary binary1 = new Binary("0");
		Binary binary2 = new Binary("0");
		Binary binary3 = Binary.Multiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }


    
}


