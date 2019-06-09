package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringExample {

	StringExample s = new StringExample();

	@Test
	public void testConcat() {
		String s1 = new String("viha");
		String s2 = new String("rika");
		String s3 = s.Concat(s1, s2);
		assertEquals("viharika", s3);

	}

	@Test
	public void TestStringlen() {
		String s1 = new String("viha");
		String s2 = new String("rika");
		int[] actual = s.getlength(s1, s2);
		int[] expected = { 4, 4 };
		assertArrayEquals(expected, actual);
	}

	@Test
	public void TestSplit() {
		String s1 = new String("viha");
		String s2 = new String("rika");
		String[] actual = s.SplitString(s1, s2);
		String[] expected = { "v", "i", "h", "a", "r", "i", "k", "a" };
		assertArrayEquals(expected, actual);
	}

}
