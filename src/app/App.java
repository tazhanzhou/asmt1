package app;

import task.CheckTwoEnds;

public class App {

	public static void main(String[] args) {

		CheckTwoEnds checkTwoEnds = new CheckTwoEnds();
		
		int[] array1 = new int[] {1,2,3,4,5,6};
		int[] array2 = new int[] {1,2,3,4,5,1};
		
		
		System.out.println(Boolean.toString(checkTwoEnds.Check(array1)));
		System.out.println(Boolean.toString(checkTwoEnds.Check(array2)));

	}

}
