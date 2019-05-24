package com.problemsolving.practise;

public class SolutionSort {

	// partitioning
	private static int partition(int[] arr, int startIndex, int endIndex) {

		int pValue = arr[endIndex];
		int pIndex = 0;
		int temp;

		for (int i = 0; i < endIndex - 1; i++) {
			if (arr[i] <= pValue) {
				// swap current value with pviot value
				temp = arr[pIndex];
				arr[i] = pValue;
				pValue = arr[i];
				
				pIndex++;
			}
			
			// swap element at last index at its own position
			temp = arr[pIndex];
		}

		return 0;
	}

	// sorting
	private static void QickSor(int[] arr, int startIndex, int endIndex) {

		if (startIndex > endIndex) {

		}
		int pivotIndex = partition(arr, startIndex, endIndex);
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 4, 5, 6, 8, 2, 1, 8 };

	}
}
