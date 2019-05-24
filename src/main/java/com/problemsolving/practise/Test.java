package com.problemsolving.practise;

import java.util.Arrays;
import java.util.BitSet;

public class Test {

	public static void main(String[] args) {
		int[] a=new int[]{9,5,1,2,4};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 9));
		
		BitSet bitSet = new BitSet();

	}

}
