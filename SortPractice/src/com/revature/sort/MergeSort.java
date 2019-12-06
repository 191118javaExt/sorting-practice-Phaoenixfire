package com.revature.sort;

public class MergeSort {

	public static void sort(int[] arr) {
		/*
		 * Takes in an array. Divides the array into two parts Passes the the left side
		 * and right side into merge.
		 * 
		 */
		if (arr.length < 2) {
			return;
		} else {

			int middle = arr.length / 2;
			int[] arrLeft = new int[middle];
			int[] arrRight = new int[arr.length - middle];

			for (int i = 0; i < middle; i++) {
				arrLeft[i] = arr[i];
			}
			for (int i = middle; i < arr.length; i++) {
				arrRight[i - middle] = arr[i];
			}
			sort(arrLeft);
			sort(arrRight);
			merge(arr, arrLeft, arrRight);
		}
	}

	private static void merge(int[] arr, int[] left, int[] right) {

		int i = 0;
		int j = 0;

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[i + j] = left[i];
				i++;
			} else {
				arr[i + j] = right[j];
				j++;
			}

		}
		for (; i < left.length; i++) {
			arr[i + j] = left[i];
		}

		for (; j < right.length; j++) {
			arr[i + j] = right[j];
		}
	}
}
