package oraykt;
/*
 * Created by Oray Kurt
 * Date: 16-Jul-2020
 * Time: 16:30
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {

	List<Integer> arrayList;
	BubbleSort bubbleSort;

	@BeforeEach
	public void setUp() {
		// Default Array initialized
		arrayList = new ArrayList<>(Arrays.asList(10, 9, 5, 4, 3, 2, 1));
		bubbleSort = new BubbleSort();
	}

	@Test
	public void testBubbleSort() {
		Integer[] expectedArray = {1, 2, 3, 4, 5, 9, 10};
		System.out.println("Default Array: " + Arrays.toString(arrayList.toArray()));
		System.out.println("Expected Array: " + Arrays.toString(expectedArray));
		Assertions.assertArrayEquals(expectedArray, bubbleSort.getSortedArray(arrayList.toArray(new Integer[0])));
	}
}
