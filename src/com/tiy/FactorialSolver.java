package com.tiy;

/**
 * Created by Brett on 9/28/16.
 */
public class FactorialSolver {

	public long factorialMath(long numberToFactor) {

		long initialNumber = numberToFactor;

		if (numberToFactor == 1) {
			return numberToFactor;
		}
		return numberToFactor*(factorialMath((initialNumber-1)));
	}


}
