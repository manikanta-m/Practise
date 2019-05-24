package com.problemsolving.practise.sort;

// program for sorting an array using quick sort
import java.util.Arrays;

public class QuickSort {

	// partitioning
	public int partition(int arr[], int startIndex, int endIndex) {

		int pivot = arr[endIndex];

		int partitionIndex = startIndex;
		int temp;
		for (int i = 0; i < endIndex; i++) {
			if (arr[i] <= pivot) {
				temp = arr[i];
				arr[i] = arr[partitionIndex];
				arr[partitionIndex]=temp;
				partitionIndex = partitionIndex + 1;
			}
		}

		temp = arr[partitionIndex];
		arr[partitionIndex] = arr[endIndex];
		arr[endIndex] = temp;

		return partitionIndex;
	}

	// divide and conquer
	public void Q(int arr[], int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pIndex = partition(arr, startIndex, endIndex);

			Q(arr, startIndex, pIndex - 1);
			Q(arr, pIndex + 1, endIndex);
		}
	}

	public static void print(int arr[]){
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int array[] = new int[] { 2, 0, 5, 78, 8, 9 };
		QuickSort quickSort = new QuickSort();
		print(array);
		quickSort.Q(array,0,array.length-1);
		print(array);
		
	}
}
