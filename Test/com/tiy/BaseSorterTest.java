package com.tiy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Brett on 9/27/16.
 */
public class BaseSorterTest {

	BaseSorter sorter = new SelectionSorter();
	Fibonacci myFib = new Fibonacci();
	FactorialSolver myFactorialSolver = new FactorialSolver();

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private void assert3ElementOrder(int[] numArray) {
		assertEquals(5, numArray[0]);
		assertEquals(7, numArray[1]);
		assertEquals(19, numArray[2]);
	}

	private void assert4ElementOrder(int[] numArray) {
		assertEquals(3, numArray[0]);
		assertEquals(12, numArray[1]);
		assertEquals(19, numArray[2]);
		assertEquals(34, numArray[3]);
	}

	private void assertRepeatedNumbers(int[] numArray) {
		assertEquals(2, numArray[0]);
		assertEquals(4, numArray[1]);
		assertEquals(6, numArray[2]);
		assertEquals(6, numArray[3]);
		assertEquals(10, numArray[4]);
		assertEquals(14, numArray[5]);
	}

	@Test
	public void bubbleSort3ElementArray() throws Exception {
		int[] orderedArray = {5, 7, 19};
		sorter.sort(orderedArray);
		assert3ElementOrder(orderedArray);

		int[] scrambledArray1 = {5, 19, 7};
		sorter.sort(scrambledArray1);
		assert3ElementOrder(scrambledArray1);

		int[] scrambledArray2 = {7, 5, 19};
		sorter.sort(scrambledArray2);
		assert3ElementOrder(scrambledArray2);

		int[] scrambledArray3 = {7, 19, 5};
		sorter.sort(scrambledArray3);
		assert3ElementOrder(scrambledArray3);

		int[] scrambledArray4 = {19, 7, 5};
		sorter.sort(scrambledArray4);
		assert3ElementOrder(scrambledArray4);

		int[] scrambledArray5 = {19, 5, 7};
		sorter.sort(scrambledArray5);
		assert3ElementOrder(scrambledArray5);
	}

	@Test
	public void bubbleSort4ElementArray() throws Exception {
		int[] orderedArray = {3, 12, 19, 34};
		sorter.sort(orderedArray);
		assert4ElementOrder(orderedArray);

		int[] scrambledArray1 = {12, 34, 19, 3};
		sorter.sort(scrambledArray1);
		assert4ElementOrder(scrambledArray1);

		int[] scrambledArray2 = {12,3,34,19};
		sorter.sort(scrambledArray2);
		assert4ElementOrder(scrambledArray2);

		int[] scrambledArray3 = {19,34,3,12};
		sorter.sort(scrambledArray3);
		assert4ElementOrder(scrambledArray3);

		int[] scrambledArray4 = {3,19,34,12};
		sorter.sort(scrambledArray4);
		assert4ElementOrder(scrambledArray4);

		int[] scrambledArray5 = {34,3,19,12};
		sorter.sort(scrambledArray5);
		assert4ElementOrder(scrambledArray5);
	}

	@Test
	public void sortRepeatedNumbers() throws Exception {
		int[] orderedArray = {2, 4, 6, 6, 10, 14};
		sorter.sort(orderedArray);
		assertRepeatedNumbers(orderedArray);

		int[] scrambledArray1 = {6,4,6,10,14,2};
		sorter.sort(scrambledArray1);
		assertRepeatedNumbers(scrambledArray1);

		int[] scrambledArray2 = {14,6,10,2,4,6};
		sorter.sort(scrambledArray2);
		assertRepeatedNumbers(scrambledArray2);
	}

	@Test
	public void getFibTest() {
		assertEquals(3, myFib.getFib(4));
		System.out.println(myFib.getFib(4));

		assertEquals(8, myFib.getFib(6));
		System.out.println(myFib.getFib(6));

		assertEquals(13, myFib.getFib(7));
		System.out.println(myFib.getFib(7));

		assertEquals(21, myFib.getFib(8));
		System.out.println(myFib.getFib(8));
	}

	@Test
	public void FactorialSolverTest() {
		assertEquals(6, myFactorialSolver.factorialMath(3));
		assertEquals(120, myFactorialSolver.factorialMath(5));
		assertEquals(720, myFactorialSolver.factorialMath(6));
	}



}