package com.tiy;

/**
 * Created by Brett on 9/27/16.
 */
public abstract class BaseSorter implements SortingInterface {

	public void swapNumbers(int firstIndex, int secondIndex, int[] intArray) {
		int firstNumber = intArray[firstIndex];
		intArray[firstIndex] = intArray[secondIndex];
		intArray[secondIndex] = firstNumber;
	}

	public void printNumbers(int[] numbers) {
		for (int counter = 0; counter < numbers.length; counter++) {
			System.out.print(numbers[counter] + " ");
		}
		System.out.println();
	}


}
