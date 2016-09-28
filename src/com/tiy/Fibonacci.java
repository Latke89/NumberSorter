package com.tiy;

/**
 * Created by Brett on 9/28/16.
 */
public class Fibonacci {

	public long getFib(long fibSequenceNumber) {
		return fastFib(0, 1, fibSequenceNumber);
	}

	public long fastFib(long firstFib, long secondFib, long fibTracker) {
		if (fibTracker == 1) {
			return secondFib;
		}

		long currentFibNumber = firstFib + secondFib;
		fibTracker--;
		return fastFib(secondFib, currentFibNumber, fibTracker);
	}


}
