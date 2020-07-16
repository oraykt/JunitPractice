package oraykt;
/*
 * Created by Oray Kurt
 * Date: 16-Jul-2020
 * Time: 15:05
 */

import java.util.*;

public class Main {


	public static void main(String[] args){
		/*
		The program will collect 7 numbers from the user
		 */

		Scanner userInput = new Scanner( System.in );
		List<Integer> arrayList = new ArrayList<>();
		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();

		try{
			for(int i=0; i<7; i++){
				arrayList.add(userInput.nextInt());
			}
			System.out.println(Arrays.toString(arrayList.toArray()));
			Integer [] array;
			array = bubbleSort.getSortedArray(arrayList.toArray(new Integer[0]));
			System.out.println(Arrays.toString(array));
			array = selectionSort.getSortedArray(arrayList.toArray(new Integer[0]));
			System.out.println(Arrays.toString(array));
		}catch(InputMismatchException exception){
			System.out.println("Integers only, please.");
		}
	}


}
