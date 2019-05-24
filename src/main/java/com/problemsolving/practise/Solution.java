package com.problemsolving.practise;

import java.util.Scanner;

public class Solution {

	static final int CHAR_ARRAY_SIZE = 26;

	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);

		int numberOfTestCases = in.nextInt();
		
		System.out.println(numberOfTestCases);
		for (int i = 1; i <= numberOfTestCases; i++) {
			int size = in.nextInt();
			String first = in.next();
			String second = in.next();

			System.out.println("size "+size+" string1 "+first +" string2 "+second);
			System.out.println(getCommonCount(first, second, size));

		}

		in.close();
	}

	static int getCommonCount(String s1, String s2, int size) {
		int count = 0;
		int[] a1 = new int[CHAR_ARRAY_SIZE];
		int[] a2 = new int[CHAR_ARRAY_SIZE];

		for (int i = 0; i < size; i++) {
			a1[s1.charAt(i) - 'a'] += 1;

			a2[s2.charAt(i) - 'a'] += 1;
		}

		/*for (int i = 0; i < CHAR_ARRAY_SIZE; i++) {
			if (a1[i] != 0 && a2[i] != 0) {
				if (a1[i] == a2[i]) {
					count = count + a1[i];
				} else {
					count = count + (Math.abs(a1[i] - a2[i]));
				}
			}
		}*/

		return count;
	}

}
