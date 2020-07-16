package oraykt;
/*
 * Created by Oray Kurt
 * Date: 16-Jul-2020
 * Time: 16:03
 */

public class SelectionSort {
	Integer[] getSortedArray(Integer[] array){
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int minId = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minId = j;
				}
			}
			int temp = array[i];
			array[i] = min;
			array[minId] = temp;
		}
		return array;
	}
}
