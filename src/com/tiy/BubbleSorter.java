package com.tiy;

/**
 * Created by Brett on 9/27/16.
 */
public class BubbleSorter extends BaseSorter {

	public void sort(int[] arrayToSort) {
		int initialMax = arrayToSort.length;
		for (int currentMax = initialMax; currentMax >= 0; currentMax--) {
			for (int counter = 0; counter < currentMax - 1; counter++) {
				if (arrayToSort[counter] > arrayToSort[counter + 1]) {
					swapNumbers(counter, counter + 1, arrayToSort);
				}
			}
			printNumbers(arrayToSort);
		}


	}

}
