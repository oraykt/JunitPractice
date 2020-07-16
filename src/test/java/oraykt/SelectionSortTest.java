package oraykt;
/*
 * Created by Oray Kurt
 * Date: 16-Jul-2020
 * Time: 16:48
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSortTest {

	List<Integer> arrayList;
	SelectionSort selectionSort;

	@BeforeEach
	public void setUp() {
		// Default Array initialized
		arrayList = new ArrayList<>(Arrays.asList(10, 9, 5, 4, 3, 2, 1));
		selectionSort = new SelectionSort();
	}

	@Test
	public void testBubbleSort() {
		Integer[] expectedArray = {1, 2, 3, 4, 5, 9, 10};
		System.out.println("Default Array: " + Arrays.toString(arrayList.toArray()));
		System.out.println("Expected Array: " + Arrays.toString(expectedArray));
		Assertions.assertArrayEquals(expectedArray, selectionSort.getSortedArray(arrayList.toArray(new Integer[0])));
	}
}
