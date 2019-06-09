package com.example;

import java.util.Arrays;

public class StringExample {
	public String Concat(String a, String b) {
		String x = a + b;
		return x;
	}

	public int[] getlength(String a, String b) {
		int x = a.length();
		int y = b.length();
		int c[] = { x, y };

		return c;

	}

	public String[] SplitString(String a, String b) {
		String[] x = a.split("");
		String[] y = b.split("");
		int length = a.length() + b.length();
		String[] result = new String[length];
		System.arraycopy(x, 0, result, 0, a.length());
		System.arraycopy(y, 0, result, a.length(), b.length());
		return result;
	}

	public static void main(String[] args) {
		String st1 = args[0];
		String st2 = args[1];
		StringExample s = new StringExample();

		int d[] = s.getlength(st1, st2);
		System.out.println("Length of string is:" + Arrays.toString(d));
		String[] e = s.SplitString(st1, st2);
		System.out.println(" SplitString:" + Arrays.toString(e));
		System.out.println("Concat of two strings: " + s.Concat(st1, st2));
		s.getlength(st1, st2);
		s.SplitString(st1, st2);
	}
}